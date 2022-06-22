package tech.getarrays.employeemanager.repositories;

import tech.getarrays.employeemanager.entities.OrderItem;
import tech.getarrays.employeemanager.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
