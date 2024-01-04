package models;

import java.util.Arrays;

public class Tshirt {

    //creating fields for Tshirt class w their respective datatypes
    String name;
    int product_code;
    int price;
    String brand;
    String description;

    String[] sizes;

    //creating constructor for easy input of values in object
    public Tshirt(String name, int product_code, int price, String brand, String description, String[] sizes) {
        this.name = name;
        this.product_code = product_code;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    //creating getter and setter for each variable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProduct_code() {
        return product_code;
    }

    public void setProduct_code(int product_code) {
        this.product_code = product_code;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }

    //creating our custom method for displaying require info
    // "this." is used to pull the required variable from the needed Object
    public void tshirt_display(){
        System.out.println("Item Name: "+ this.name);
        System.out.println("Description: "+ this.description);
        System.out.println("Product Code: "+ this.product_code);
        System.out.println("Brand: "+ this.brand);
        System.out.println("Price: "+ this.price);
        System.out.println("Sizes: "+ Arrays.toString(this.sizes));
        System.out.println("------------------------------------");

    }
}
