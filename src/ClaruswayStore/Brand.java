package JavaProjects.ClaruswayStore;

import java.util.ArrayList;
import java.util.List;

public class Brand {

    private static int no = 100;
    private int id;//ürün id si
    private String name;// Ürün markası
    static List<Brand> brandList = new ArrayList<>(); //= Ürün marka listesi



    public Brand() {
    }

    public Brand(String name) {
        this.name = name;
        this.id = no++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createBrands(String name) {//Markaların marka listesine atıldığı ve brandList listesine ekleme işlemi yapıldı.
        Brand marka=new Brand(name);
        brandList.add(marka);
    }

    public static void printBrands() {//Marka isimlerinin konsolda görünmesini sağlayacak bir metot oluştu

        for (Brand y : brandList) {
            System.out.println(y);
        }

    }

    public String getBrand(int id) {//Parametre olarak marka id sini alarak bizlere ilgili markayı return etmeyi sağlayan bir metot oluştu
        for (Brand x : brandList) {
            if (x.getId() == id) {
                return x.getName();
            }
        }
        return "Bu id'ye sahip bir marka bulunmamaktadır.";
    }

    @Override
    public String toString() {
        return
                "Ürün Markası= " + name + "Ürün Id=" + id ;

    }
}
