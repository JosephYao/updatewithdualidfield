package com.odde.baozun;

import javax.persistence.*;

@Entity
@Table(name = "baozun_orders")
public class Order {

    @Id
    @GeneratedValue
    private long id;
    @Column(name = "name")
    private String name;

    @JoinColumn(name = "shop_id")
    @ManyToOne
    private Shop shop;

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
