package com.odde.baozun;


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

    @Test
    public void update_with_dual_id_fields() {

        pocService.updateOrder();

    }

}
