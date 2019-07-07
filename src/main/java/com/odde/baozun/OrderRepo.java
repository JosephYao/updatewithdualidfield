package com.odde.baozun;

import org.springframework.data.repository.Repository;

public interface OrderRepo extends Repository<Order, Long> {

    Order save(Order order);

    void deleteAll();
}
