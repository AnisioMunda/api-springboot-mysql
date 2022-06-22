package tech.getarrays.employeemanager.repositories;

import tech.getarrays.employeemanager.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRespository extends JpaRepository<User,Long> {
}
