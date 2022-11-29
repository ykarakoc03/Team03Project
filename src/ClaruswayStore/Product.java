package JavaProjects.ClaruswayStore;

import java.util.Scanner;

public abstract class Product {

    private int id;// Ürün id si
    private String name;//Ürün ismi
    private double price;//Ürün fiyatı
    private double discountRate;//Ürün indirim oranı
    private int amount;//Ürün stoğu
    private Brand brand;//Brand
    private double screenSize;// Ürün ekran boyutu
    private int ram;// Ürün ram i
    private int memory;// Ürün hafızası

    public Product(int id, String name, double price, double discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;
    }

    public Product() {
    }

    public abstract void menu();

    public abstract  void addItem();

    public abstract void getProducts();

    public abstract void deleteItem();


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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
