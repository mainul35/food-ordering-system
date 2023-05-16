package com.food.ordering.system.order.service.domain.entity;

import com.food.ordering.system.domain.entity.AggregateRoot;
import com.food.ordering.system.domain.valueobject.RestaurantId;
import lombok.Getter;

import java.util.List;

@Getter
public class Restaurant extends AggregateRoot<RestaurantId> {
    private final List<Product> productList;
    private boolean active;

    public Restaurant(Builder builder) {
        super.setId(builder.id);
        productList = builder.productList;
        active = builder.active;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private RestaurantId id;
        private List<Product> productList;
        private boolean active;

        private Builder() {
        }

        public Builder restaurantId(RestaurantId val) {
            id = val;
            return this;
        }

        public Builder active(boolean val) {
            active = val;
            return this;
        }

        public Restaurant build() {
            return new Restaurant(this);
        }
    }
}
