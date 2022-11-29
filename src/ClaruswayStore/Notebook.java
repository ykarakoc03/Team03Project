package JavaProjects.ClaruswayStore;

import java.util.ArrayList;
import java.util.Scanner;

public class Notebook extends Product {
    static int nId = 1000;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Notebook> notebooks = new ArrayList<>();

    //public Notebook(int id, String name, double price, double discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {
    //    super(id, name, price, discountRate, amount, brand, screenSize, ram, memory);
    //}


    public Notebook(String name, double price, double discountRate, int amount, Brand brand, double screenSize, int ram, int memory) {
        super(nId, name, price, discountRate, amount, brand, screenSize, ram, memory);
        nId++;
    }

    public Notebook() {
    }

    @Override
    public void menu() {//(Notebook ekleme, listesinin görüntülenmesi, silme, markaya göre filtreleme)

        System.out.println("**********************************    " + " \nNoteBook Ekranı\n" + "**********************************");
        System.out.println("1- Notebook Ekleme " +
                "\n2- Notebook Listeleme" +
                "\n3- Notebook Silme" +
                "\n4- Markaya Göre Filitreleme" +
                "\nQ- CIKIS ");
        System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");

        String options = scanner.nextLine().toUpperCase();
        switch (options) {
            case "1"://1- Notebook Ekleme
                addItem();
                menu();
                break;
            case "2"://2- Notebook Listeleme"
                getProducts();
                menu();
                break;
            case "3"://3- Notebook Silme"
                deleteItem();
                menu();
                break;
            case "4"://4- Markaya Göre Filitreleme
                brandFilter();
                menu();
                break;
            case "Q"://
                Store claruswayStore = new Store();
                claruswayStore.run();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                menu();//recursive method call
                break;


        }

    }

    @Override
    public void addItem() {//name,price,discountRate,amount,brand,screenSize,ram,memory
        System.out.println("Ürünün ismini giriniz: ");
        String name = scanner.nextLine();
        System.out.println("Ürünün fiyatını giriniz: ");
        double price = scanner.nextDouble();
        System.out.println("Ürünün indirim oranını giriniz: ");
        double discountRate = scanner.nextDouble();
        System.out.println("Ürünün miktarını giriniz: ");// Miktarı static arttırıp azaltacak şekilde düzenlenmeli!!!
        int amount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ürünün markasını listeden seçiniz : ");
        Brand.printBrands();
        Brand brand = Brand.getBrand(scanner.nextInt());
        System.out.println("Ürünün ekran boyutunu giriniz: ");
        double screenSize = scanner.nextDouble();
        System.out.println("Ürünün ram miktarını giriniz giriniz: ");
        scanner.nextLine();
        int ram = scanner.nextInt();
        System.out.println("Ürünün dahili hafıza miktarını giriniz: ");
        int memory = scanner.nextInt();
        if (!(amount == 1)) {
            for (int i = 0; i < amount; i++) {
                Notebook notebookObj = new Notebook(name, price, discountRate, amount, brand, screenSize, ram, memory);
                notebooks.add(notebookObj);
            }
        } else {
            Notebook notebookObj = new Notebook(name, price, discountRate, amount, brand, screenSize, ram, memory);
            notebooks.add(notebookObj);
            System.out.println("Eklenen ürünün id'si: " + notebookObj.getId());
        }

    }

    @Override
    public void getProducts() {
        for (Notebook product : notebooks) {
            System.out.println(product.toString());
            System.out.println("----------------------------------------------" +
                    "-----------------------------------------------------------------");
        }
    }

    void brandFilter() {//→ Filtreleme işlemleri yapılmalıdır.
        Brand.printBrands();
        System.out.println("filitrelemek istediğiniz markayi seçiniz :");
        int filitrele = scanner.nextInt();
        if (notebooks.stream().anyMatch(t -> t.getBrand().getId() == filitrele))
            notebooks.stream().filter(t -> t.getBrand().getId() == filitrele).forEach(t -> System.out.println(t));
        else System.out.println("Aradığınız ürün mevcut değil");

    }


    @Override
    public void deleteItem() {
        getProducts();
        System.out.println("Silmek istediginiz ürün Id'sini giriniz :");//ürün miktarının hepsimi silinecek yada biri mi silinecek
        int silinecekId = scanner.nextInt();                             // veya eklenen her bir ürüne id leri farklımı atanmalı
        boolean flag = false;                                            // stog miktarı düzenlenmeli!!!
        for (Notebook product : notebooks) {
            if (silinecekId == product.getId()) {
                notebooks.remove(product);
                flag = true;
                System.out.println("Girdiğiniz id'ye ait ürün silindi...");
                break;
            }
        }
        if (flag = false) System.out.println("Aradığınız ürün mevcut değil.");
    }

    @Override
    public String toString() {
        return "Notebook " +
                "| id=" + getId() +
                "| name='" + getName() +
                "| price=" + getPrice() +
                "| discountRate=" + getDiscountRate() +
                "| amount=" + getAmount() +
                "| brand='" + getBrand().getName() +
                "| screenSize=" + getScreenSize() +
                "| ram='" + getRam() +
                "| memory='" + getMemory() +
                "|";
    }


}


