package com.odde.baozun;

import org.springframework.beans.factory.annotation.Autowired;

public class PocService {

    @Autowired
    OrderRepo orderRepo;

    public void updateOrder() {
        Order order = new Order();
        order.setName("Test Order");
        orderRepo.save(order);
    }
}
