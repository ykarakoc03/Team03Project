package JavaProjects.ClaruswayStore;

import java.util.Scanner;

public abstract class Product {
    Scanner scanner = new Scanner(System.in);
    int id;// Ürün id si
    String name;//Ürün ismi
    double price;//Ürün fiyatı
    double discountRate;//Ürün indirim oranı
    int amount;//Ürün stoğu
    String brand;//Brand
    double screenSize;// Ürün ekran boyutu
    String ram;// Ürün ram i
    String memory;// Ürün hafızası

    abstract void menu();

    abstract  void addItem();

    abstract void getProducts();

    abstract void deleteItem();

}
