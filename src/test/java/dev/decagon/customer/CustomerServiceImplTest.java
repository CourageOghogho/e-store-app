package dev.decagon.customer;

import dev.decagon.product.Products;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerServiceImplTest {


    @Test
    @DisplayName("When the product is in stock")
    void testBuyProductWhenStock(){
        CustomerService customerService=new CustomerServiceImpl();
        float productPrice=300.4f;
        assertEquals(customerService.buyProduct(new Products(10, "One-World glass cup",
                        3,productPrice )),"Total Bill is: "+productPrice,
                "Should return Total Bill is: "+productPrice);
    }

    @Test
    @DisplayName("When the product is not in stock")
    void testBuyProductWhenNotStock(){
        CustomerService customerService=new CustomerServiceImpl();
        float productPrice=300.4f;
        assertEquals(customerService.buyProduct(new Products(10, "One-World glass cup",
                        0,productPrice )),"Not in Stock",
                "Should return Not in Stock");
    }

}


