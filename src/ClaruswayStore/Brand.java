package JavaProjects.ClaruswayStore;

import java.util.ArrayList;
import java.util.List;

public class Brand {

    private static int no = 100;
    private int id;//ürün id si
    private String name;// Ürün markası
    static List<Brand> brandList = new ArrayList<>(); //= Ürün marka listesi

    //static List<String> markaList=new ArrayList<>();

    public Brand() {
    }

    public Brand(int id, String name) {
        this.name = name;
        this.id = no++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = no++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void createBrands(String name) {//Markaların marka listesine atıldığı ve brandList listesine ekleme işlemi yapıldı.
        Brand b = new Brand(id, name);
        brandList.add(b);
    }

    public static void printBrands() {//Marka isimlerinin konsolda görünmesini sağlayacak bir metot oluştu
        //System.out.println(brandList);
        List<String> markaList = new ArrayList<>();
        for (Brand y : brandList) {
            markaList.add(y.name);
        }
        System.out.println(markaList);
    }

    public String getBrand(int id) {//Parametre olarak marka id sini alarak bizlere ilgili markayı return etmeyi sağlayan bir metot oluştu
        // Brand brand = new Brand();
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
                "(name=" + name + ",id=" + id + ")";

    }
}
