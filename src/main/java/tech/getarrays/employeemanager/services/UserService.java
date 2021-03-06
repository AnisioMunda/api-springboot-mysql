package tech.getarrays.employeemanager.services;

import tech.getarrays.employeemanager.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;
import tech.getarrays.employeemanager.repositories.UserRespository;
import tech.getarrays.employeemanager.services.exceptions.DatabaseException;
import tech.getarrays.employeemanager.services.exceptions.ResourceNotFoundException;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRespository respository;

    public List<User> findAll() {
        return respository.findAll();
    }

    public  User findById(Long id){
        Optional<User> obj = respository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User obj){
        return respository.save(obj);
    }

    public void delete(Long id){
        try {
            respository.deleteById(id);
        }catch (EmptyResultDataAccessException e){
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e){
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id,User obj){
        try {
            User entity = respository.getOne(id);
            updateData(entity,obj);
            return respository.save(entity);
        }catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User entity, User obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
