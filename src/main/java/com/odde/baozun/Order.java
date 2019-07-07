package com.odde.baozun;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "baozun_orders")
@IdClass(OrderPK.class)
public class Order implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long orderId;
    @Column(name = "name")
    private String name;

    @Id
    @ManyToOne(cascade = CascadeType.ALL)
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
        shop.addOrder(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }
}
