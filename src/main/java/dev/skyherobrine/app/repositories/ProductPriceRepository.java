package dev.skyherobrine.app.repositories;

import dev.skyherobrine.app.models.Product;
import dev.skyherobrine.app.models.ProductPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ProductPriceRepository extends JpaRepository<ProductPrice, Product>, JpaSpecificationExecutor<ProductPrice> {
}