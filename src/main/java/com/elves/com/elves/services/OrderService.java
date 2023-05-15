package com.elves.com.elves.services;

import com.elves.entities.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    public ShippingService shippingService;

    public double total(Order order) {
        return order.getBasic() - order.getDiscount()*order.getBasic()/100 + ShippingService.shipment(order);
    }
}
