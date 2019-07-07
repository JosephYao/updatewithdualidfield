package com.odde.baozun;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class PocTest {

    @Autowired
    PocService pocService;

    @Autowired
    OrderRepo orderRepo;

    @Autowired
    ShopRepo shopRepo;

    @Before
    public void cleanUp() {
        orderRepo.deleteAll();
        shopRepo.deleteAll();
    }

    @Test
    public void update_with_dual_id_fields() {
        Shop shop = new Shop();
        shop.setName("Nike");
        shopRepo.save(shop);
        Order order = new Order();
        order.setName("Test order");
        order.setShop(shop);
        orderRepo.save(order);

        pocService.updateOrderName(order, "a new name");
    }

}
