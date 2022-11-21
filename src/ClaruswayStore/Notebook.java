package JavaProjects.ClaruswayStore;

import java.util.ArrayList;

public class Notebook extends Product {
    static int nId = 101;

    ArrayList<Notebook> notebooks = new ArrayList<>();

    public Notebook() {//addItem() methodu ile ürün oluşturabilmek için parametresiz const.
    }

    public Notebook(String name, double price, double discountRate, int amount, String brand, double screenSize, String ram, String memory) {
        this.id = nId++;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.amount = amount;
        this.brand = brand;
        this.screenSize = screenSize;
        this.ram = ram;
        this.memory = memory;
    }


    @Override
    void menu() {//(Notebook ekleme, listesinin görüntülenmesi, silme, markaya göre filtreleme)

        System.out.println("**********************************    " + " \nNoteBook Ekranı\n" + "**********************************");
        System.out.println("1- Notebook Ekleme " +
                "\n2- Notebook Listeleme" +
                "\n3- Notebook Silme" +
                "\n4- Markaya Göre Filitreleme" +
                "\nQ- CIKIS ");
        System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
        String secim = scanner.nextLine().toUpperCase();
        switch (secim) {
            case "1"://1- Notebook Ekleme
                addItem();
                menu();
                break;
            case "2"://2- Notebook Listeleme"
                getProducts();
                menu();
                break;
            case "3"://3- Notebook Silme"

                menu();
                break;
            case "4"://4- Markaya Göre Filitreleme

                menu();
                break;
            case "Q"://
                deleteItem();
                //cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                menu();//recursive method call
                break;


        }

    }

    @Override
    void addItem() {//name,price,discountRate,amount,brand,screenSize,ram,memory
        System.out.println("Ürünün ismini giriniz: ");
        this.name = scanner.nextLine();
        System.out.println("Ürünün fiyatını giriniz: ");
        this.price = scanner.nextDouble();
        System.out.println("Ürünün indirim oranını giriniz: ");
        this.discountRate = scanner.nextDouble();
        System.out.println("Ürünün miktarını giriniz: ");// Miktarı static arttırıp azaltacak şekilde düzenlenmeli!!!
        this.amount = scanner.nextInt();
        System.out.println("Ürünün markasını giriniz: ");// marka classı ile baglantı kurulup düzeltilmeli!!!
        this.brand = scanner.nextLine();
        System.out.println("Ürünün ekran boyutunu giriniz: ");
        this.screenSize = scanner.nextDouble();
        System.out.println("Ürünün ram miktarını giriniz giriniz: ");
        this.ram = scanner.nextLine();
        System.out.println("Ürünün dahili hafıza miktarını giriniz: ");
        this.memory = scanner.nextLine();
        Notebook notebookObj = new Notebook();
        notebooks.add(notebookObj);

    }

    @Override
    void getProducts() {
        for (Notebook product : notebooks) {
            System.out.println(toString());
            System.out.println("----------------------------------------------" +
                    "-----------------------------------------------------------------");
        }
    }

    void brandFilter() {//→ Filtreleme işlemleri yapılmalıdır.



    }


    @Override
    void deleteItem() {
        System.out.println("Silmek istediginiz ürün Id'sini giriniz :");//ürün miktarının hepsimi silinecek yada biri mi silinecek
        int silinecekId = scanner.nextInt();                             // veya eklenen her bir ürüne id leri farklımı atanmalı
        boolean flag = false;                                            // stog miktarı düzenlenmeli!!!
        for (Notebook product : notebooks) {
            if (silinecekId == product.id)
                notebooks.remove(product);
            flag = true;
            System.out.println("Girdiğiniz id'ye ait ürün silindi...");
            break;
        }
        if (flag = false) System.out.println("Aradığınız ürün mevcut değil.");
    }

    @Override
    public String toString() {
        return "Notebook " +
                "| id=" + id +
                "| name='" + name + '\'' +
                "| price=" + price +
                "| discountRate=" + discountRate +
                "| amount=" + amount +
                "| brand='" + brand + '\'' +
                "| screenSize=" + screenSize +
                "| ram='" + ram + '\'' +
                "| memory='" + memory + '\'' +
                "|";
    }


}
