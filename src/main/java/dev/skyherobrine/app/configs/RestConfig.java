package dev.skyherobrine.app.configs;

import dev.skyherobrine.app.models.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class RestConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config, CorsRegistry cors) {
        config.exposeIdsFor(Product.class);
        config.exposeIdsFor(Customer.class);
        config.exposeIdsFor(Order.class);
        config.exposeIdsFor(OrderDetail.class);
        config.exposeIdsFor(ProductPrice.class);
        config.exposeIdsFor(ProductImage.class);
    }
}
