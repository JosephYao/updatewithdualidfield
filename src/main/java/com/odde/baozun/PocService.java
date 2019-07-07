package com.odde.baozun;

import org.springframework.beans.factory.annotation.Autowired;

public class PocService {

    @Autowired
    OrderRepo orderRepo;

    public void updateOrderName(Order order, String name) {
        order.setName(name);
        orderRepo.save(order);
    }
}
