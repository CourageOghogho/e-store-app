package dev.decagon.staff;

import dev.decagon.product.Products;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CashierServiceImplTest {

    @Nested
    class SellProduct{
       @Test
       @DisplayName("When there is product in stock")
       void testSellProductItemInStock(){
           CashierService cashierService=new CashierServiceImpl();
           Products product=new Products();
           product.setId(1);
           product.setName("iPhone 12");
           product.setPrice(4500000.0f);
           product.setProductsInStock(3);

           assertSame(cashierService.sellProduct(product),"Success","should return Success");

       }
       @Test
       @DisplayName("When there the product is not in stock")
       void testSellProductItemNotInStock(){
           CashierService cashierService=new CashierServiceImpl();
           assertSame(cashierService.sellProduct(
                           new Products(11,"NIVEA Lotion",0,3000.00f)),
                   "Failed, Product not in stock","should return Failed, Product not in stock");
       }
   }


   @Nested
   class DispenseReceipt {


        @Test
        @DisplayName("When price is total price of each product")
        void dispenseReceipt() {
           CashierService cashierService = new CashierServiceImpl();
           float cupPrice = 2500.50f;
           float lotionPrice = 3000.00f;
           float laptopPrice = 500.70f;
           Products cup = new Products(10, "One-World glass cup", 3, cupPrice);
           Products lotion = new Products(11, "NIVEA Lotion", 9, lotionPrice);
           Products laptop = new Products(15, "Hp Laptop", 2, laptopPrice);

           List<Products> order = new ArrayList<>();
           order.add(cup);
           order.add(lotion);
           order.add(laptop);


           float totalAmount = cupPrice + laptopPrice + lotionPrice;

           assertEquals(cashierService.disSpenceReceipt(order), "Total Bill is: "+totalAmount,
                   "Should return Total Bill is "+" "+totalAmount);


       }


       @Test
       @DisplayName("When price is not total price of each product")
       void dispenseReceiptWhenNotTotalPrice() {
           CashierService cashierService = new CashierServiceImpl();
           float cupPrice = 2500.50f;
           float lotionPrice = 3000.00f;
           float laptopPrice = 500.70f;
           Products cup = new Products(10, "One-World glass cup", 3, cupPrice);
           Products lotion = new Products(11, "NIVEA Lotion", 9, lotionPrice);
           Products laptop = new Products(15, "Hp Laptop", 2, laptopPrice);

           List<Products> order = new ArrayList<>();
           order.add(cup);
           order.add(lotion);
           order.add(laptop);


           float totalAmount = cupPrice + laptopPrice;

           assertNotEquals(cashierService.disSpenceReceipt(order), "Total Bill is: "+totalAmount,
                   "Should return Total Bill is "+" "+totalAmount);


       }
   }
}