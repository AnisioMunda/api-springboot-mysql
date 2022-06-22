package tech.getarrays.employeemanager.repositories;

import tech.getarrays.employeemanager.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
