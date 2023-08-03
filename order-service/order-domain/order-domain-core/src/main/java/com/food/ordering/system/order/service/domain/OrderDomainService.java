package com.food.ordering.system.order.service.domain;

import com.food.ordering.system.order.service.domain.entity.Order;
import com.food.ordering.system.order.service.domain.entity.Restaurant;
import com.food.ordering.system.order.service.domain.events.OrderCancelledEvent;
import com.food.ordering.system.order.service.domain.events.OrderCreatedEvent;
import com.food.ordering.system.order.service.domain.events.OrderPaidEvent;

public interface OrderDomainService {
    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order, Restaurant restaurant);

    void approveOrder(Order order, Restaurant restaurant);

    OrderCancelledEvent cancelOrderPayment(Order order, Restaurant restaurant);

    void cancelOrder(Order order, Restaurant restaurant);
}
