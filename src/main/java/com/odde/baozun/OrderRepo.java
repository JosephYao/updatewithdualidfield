package com.odde.baozun;

import org.springframework.data.repository.Repository;

public interface OrderRepo extends Repository<Order, Long> {

    void save(Order order);

    void deleteAll();
}
