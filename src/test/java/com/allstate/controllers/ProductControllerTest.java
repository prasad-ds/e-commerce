package com.allstate.controllers;

import com.allstate.entities.Product;
import com.allstate.services.ProductsService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartHttpServletRequest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Created by localadmin on 17/01/17.
 */

@RunWith(SpringRunner.class)
@WebMvcTest(ProductController.class)

public class ProductControllerTest {

    @Autowired
    private MockMvc mvc;

    @MockBean
    private ProductsService service;

    private Product product;

    @Before
    public void setUp() throws Exception {
        product = new Product();
        product.setId(1);
        product.setName("Speakers");
        product.setActualPrice(45);
        product.setQuantity(5);
        product.setstock_number("ABC2");
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAProduct() throws Exception {
        given(this.service.create(Mockito.any(Product.class)))
                .willReturn(product);

        MockHttpServletRequestBuilder request = post("/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"Speakers\"}");

        this.mvc.perform(request)
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id", is(1)))
                .andExpect(jsonPath("$.name", is("Speakers")));

    }

}