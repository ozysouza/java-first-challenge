package com.desouza.challenge.services;

import org.springframework.stereotype.Service;

import com.desouza.challenge.entities.Order;

@Service
public class ShippingService {

    public Double calculateFreight(Order order) {
        Double discountValue = (order.getBasic() * (order.getDiscount() / 100));
        Double orderValue = order.getBasic() - discountValue;

        if (orderValue < 100) {
            return 20.00;
        } else if (orderValue >= 100 && orderValue < 200) {
            return 12.00;
        } else {
            return 0.0;
        }
    }

}
