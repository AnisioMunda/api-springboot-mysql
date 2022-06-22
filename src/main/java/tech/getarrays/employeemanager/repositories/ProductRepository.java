package tech.getarrays.employeemanager.repositories;

import tech.getarrays.employeemanager.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {
}
