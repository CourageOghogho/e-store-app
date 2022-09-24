package dev.decagon.customer;

import dev.decagon.Users;
import dev.decagon.util.Address;
import dev.decagon.util.Gender;

public class Customers extends Users {
    private Address address;

    public Customers(int id, String name, String email, Gender gender, Address address) {
        super(id, name, email, gender);
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;

    }
}
