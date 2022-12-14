package JavaProjects.P10_aracKiralama.AracKiralamaTeam03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Filo {


    static List<Arabalar> aracListesi = new ArrayList<>();
    static List<Kisi> müsteriListesi = new ArrayList<>();

    static {
        Arabalar arac1 = new Arabalar("Honda", "Civic", "Benzin&LPG", "Otomatik", 600);
        Arabalar arac2 = new Arabalar("Honda", "Accort", "Benzin", "Otomatik", 800);
        Arabalar arac3 = new Arabalar("Honda", "City", "Benzin&LPG", "Manuel", 400);
        Arabalar arac4 = new Arabalar("Fiat", "Egea", "Dizel", "Manuel", 400);
        Arabalar arac5 = new Arabalar("Toyota", "Corolla", "Dizel", "Otomatik", 600);
        Arabalar arac6 = new Arabalar("Renault", "Megane", "Benzin", "Otomatik", 500);
        aracListesi.add(arac1);
        aracListesi.add(arac2);
        aracListesi.add(arac3);
        aracListesi.add(arac4);
        aracListesi.add(arac5);
        aracListesi.add(arac6);

        Kisi müsteri1= new Kisi("12345","Yakup","Karakoç","0536222","Afyon");
        Kisi müsteri2= new Kisi("2345","Mücahit","Tezel","0543222","Edirne");
        Kisi müsteri3= new Kisi("6789","Esma","Aslan","0378885","İzmir");
        müsteriListesi.add(müsteri1);
        müsteriListesi.add(müsteri2);
        müsteriListesi.add(müsteri3);

    }

    public void aracEkle() {

    }

    public void musteriEkle(){
        Scanner scanner = new Scanner(System.in);
        //String kimlikNo, String ad, String soyad, String telefon, String mail
        System.out.println("Kimlik numaranızın son 4 hanesini girinzi");
        String kimlikNo=scanner.nextLine();
        System.out.println("Adınızı giriniz: ");
        String ad=scanner.nextLine();
        System.out.println("Soyadınızı Giriniz: ");
        String soyad=scanner.nextLine();
        System.out.println("Telefon numaranızı giriniz: ");
        String telefon=scanner.nextLine();
        System.out.println("Adresinizi giriniz: ");
        String adres=scanner.nextLine();
        Kisi müsteri= new Kisi(kimlikNo,ad,soyad,telefon,adres);
        müsteriListesi.add(müsteri);


    }


    public static void main(String[] args) {
        for (Arabalar a:aracListesi ) {
            System.out.println(a);
        }




    }
}
