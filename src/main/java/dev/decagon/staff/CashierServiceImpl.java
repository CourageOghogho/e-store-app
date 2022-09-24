package dev.decagon.staff;

import dev.decagon.product.Products;

import java.util.List;

public class CashierServiceImpl implements CashierService {
    public String sellProduct(Products product) {
        if(product.getProductsInStock()>=1){
            product.setProductsInStock(product.getProductsInStock()-1);
            return "Success";
        }
        return "Failed, Product not in stock";
    }

    public String disSpenceReceipt(List<Products> order) {

        float totalAmount=0.00f;

        for (Products product:order
             ) {
            totalAmount+=product.getPrice();
        }

        return "Total Bill is: "+totalAmount;
    }



}
