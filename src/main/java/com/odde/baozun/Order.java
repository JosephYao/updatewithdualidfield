package com.odde.baozun;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "baozun_orders")
//@IdClass(OrderPK.class)
public class Order implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;
    @Column(name = "name")
    private String name;

    @PrimaryKeyJoinColumn(name = "shop_code", referencedColumnName = "code")
    @ManyToOne
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
