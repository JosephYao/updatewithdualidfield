package com.odde.baozun;

import java.io.Serializable;

import static java.util.Objects.hash;

public class OrderPK implements Serializable {

    private long orderId;
    private long shop;

    public OrderPK() {
    }

    public OrderPK(long orderId, long shop) {
        this.orderId = orderId;
        this.shop = shop;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderPK orderPK = (OrderPK) o;
        return orderId == orderPK.orderId &&
                shop == orderPK.shop;
    }

    @Override
    public int hashCode() {
        return hash(orderId, shop);
    }
}
