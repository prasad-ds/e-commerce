package com.allstate.services;

import com.allstate.entities.Product;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Sql(value = {"/sql/seed.sql"})
public class ProductsServiceTest {

    @Autowired
    private ProductsService service;


    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateProduct() throws Exception{
        Product before = new Product();
        before.setName("pendrive");
        before .setstock_number("ABCD56");
        before .setDescription("Description is this");
        before.setRating(2);
        before .setNoOfReviews(3);
        before.setActualPrice(1234);
        before.setDiscount(0);
        before .setDiscounted_price(1234);
        before.setQuantity(4);
        before.setis_restricted(true);

        Product after = this.service.create(before);
        assertEquals("pendrive", after.getName());
    }


}