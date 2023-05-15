package com.elves.com.elves.services;

import com.elves.entities.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {


    public double shipment (Order order) {

        if(order.getBasic() < 100.00){
            return 20.00;
        } else
        if (order.getBasic() >= 100.00 && order.getBasic() <200.00) {
            return 12.00;
        }else {
            return 0.0;
        }
    }

}
