package dev.decagon.customer;

import dev.decagon.product.Products;
import dev.decagon.staff.CashierService;
import dev.decagon.staff.CashierServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    CashierService cashierService=new CashierServiceImpl();
    public String buyProduct(Products product) {
        if(product.getProductsInStock()>0){
            cashierService.sellProduct(product);
            List order=new ArrayList<Products>();
            order.add(product);
            return cashierService.disSpenceReceipt(order);
        }else {
            return "Not in Stock";
        }
    }
}
