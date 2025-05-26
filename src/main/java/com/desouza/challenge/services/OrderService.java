package com.desouza.challenge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.desouza.challenge.entities.Order;

@Service
public class OrderService {

    @Autowired
    ShippingService shippingService;

    public Double total(Order order) {
        Double discountValue = (order.getBasic() * (order.getDiscount() / 100));
        Double price = order.getBasic() - discountValue;
        Double freight = shippingService.calculateFreight(order);
        return price + freight;
    }

}
