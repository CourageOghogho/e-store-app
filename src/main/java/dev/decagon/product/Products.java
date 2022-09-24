package dev.decagon.product;

public class Products {
    private int id;
    private String name;
    private int productsInStock;
    private float price;

    public Products(int id, String name, int productsInStock, float price) {
        this.id = id;
        this.name = name;
        this.productsInStock = productsInStock;
        this.price = price;
    }

    public Products() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductsInStock() {
        return productsInStock;
    }

    public void setProductsInStock(int productsInStock) {
        this.productsInStock = productsInStock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productsInStock=" + productsInStock +
                ", price=" + price +
                '}';
    }
}
