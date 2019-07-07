package com.odde.baozun;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "baozun_shops")
public class Shop {

    @Id
    @GeneratedValue
    private long id;

    private String code;

    private String name;

    @OneToMany(mappedBy = "shop", fetch = FetchType.EAGER)
    private Set<Order> orders = new HashSet<Order>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
