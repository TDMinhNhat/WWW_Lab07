package dev.skyherobrine.app.pks;

import dev.skyherobrine.app.models.Order;
import dev.skyherobrine.app.models.Product;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Setter @Getter
public class OrderDetailPK implements Serializable {
    private Order order;
    private Product product;
}
