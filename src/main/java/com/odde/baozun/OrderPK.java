package com.odde.baozun;

import java.io.Serializable;

import static java.util.Objects.hash;

public class OrderPK implements Serializable {

    private long id;
    private String shop;

    public OrderPK() {
    }

    public OrderPK(long id, String shop) {
        this.id = id;
        this.shop = shop;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPK orderPK = (OrderPK) o;
        return id == orderPK.id &&
                shop == orderPK.shop;
    }

    @Override
    public int hashCode() {
        return hash(id, shop);
    }
}
