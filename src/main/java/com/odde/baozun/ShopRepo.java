package com.odde.baozun;

import org.springframework.data.repository.Repository;

public interface ShopRepo extends Repository<Shop, Long> {

    void save(Shop shop);

    void deleteAll();
}
