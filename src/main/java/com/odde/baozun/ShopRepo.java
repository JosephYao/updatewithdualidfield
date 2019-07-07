package com.odde.baozun;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface ShopRepo extends Repository<Shop, Long> {

    void deleteAll();

    Shop save(Shop shop);

    List<Shop> findAll();
}
