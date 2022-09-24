package dev.decagon.staff;

import dev.decagon.product.Products;

import java.util.List;

public interface CashierService {
    public String sellProduct(Products products);
    public String disSpenceReceipt(List<Products> order);
}
