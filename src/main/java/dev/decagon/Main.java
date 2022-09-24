package dev.decagon;

import dev.decagon.product.Products;
import dev.decagon.staff.*;
import dev.decagon.util.Gender;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welome to De Dev eStore");


        //Manager module

        ManagerService managerService=new ManagerServiceImpl();
        Staff applicant=new Staff(11,"Willy","willy@gmail.com",
                Gender.FEMALE,Role.CASHIER, Qualification.BSC);
        System.out.println(managerService.hire(applicant));


        //Cashier module
        CashierService cashierService = new CashierServiceImpl();
        float cupPrice = 2500.50f;
        float lotionPrice = 3000.00f;
        float laptopPrice = 500.70f;
        Products cup = new Products(10, "One-World glass cup", 3, cupPrice);
        Products lotion = new Products(11, "NIVEA Lotion", 9, lotionPrice);
        Products laptop = new Products(15, "Hp Laptop", 2, laptopPrice);

        List<Products> order = new ArrayList<>();
        order.add(cup);order.add(lotion);order.add(laptop);
        System.out.println(cashierService.sellProduct(cup));
        System.out.println(cashierService.sellProduct(lotion));
        System.out.println(cashierService.sellProduct(laptop));
        System.out.println(cashierService.disSpenceReceipt(order));




    }
}