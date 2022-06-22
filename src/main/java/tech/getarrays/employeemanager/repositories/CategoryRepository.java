package tech.getarrays.employeemanager.repositories;

import tech.getarrays.employeemanager.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
