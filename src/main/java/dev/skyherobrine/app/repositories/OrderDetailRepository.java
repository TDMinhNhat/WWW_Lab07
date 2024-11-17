package dev.skyherobrine.app.repositories;

import dev.skyherobrine.app.models.Order;
import dev.skyherobrine.app.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Order>, JpaSpecificationExecutor<OrderDetail> {
}