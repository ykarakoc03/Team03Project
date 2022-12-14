package JavaProjects.P10_aracKiralama.AracKiralamaTeam03;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Menu {
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";
    static Scanner scan = new Scanner(System.in);
    public  void menu() {
        System.out.println(Y + "==========================ARAÇ KİRALAMA İŞLEMLERİ =======================\r\n"+Y+
                R+ "   ____________________             ____________________    \n"
                + "  | 1-ARAÇ TALEP ETME  |            | 2-ARAÇ LİSTELEME|  \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ____________________             ____________________    \n"
                + "  | 3-  ÖDEME İŞLEMLERİ |           | 4- ÇIKIŞ          |     \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯    \n"
                + "   ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯             ¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯       " + R);
        System.out.print("Yapmak istediğiniz işlemi seçiniz : ");
        int secim = scan.nextInt();
        switch (secim) {
            case 1:

                menu();
                break;
            case 2:

                menu();
                break;
            default:
                System.out.println("Lütfen 1-4 arası bir işlem seçiniz...");
                break;
        }
    }
    public void aracTalep(){
        //liste gelecek
        System.out.println("kiralamak istediğiniz aracın Id sini giriniz: ");
        int aracId=scan.nextInt();
        Stream<Arabalar> arabaKontrol =Filo.aracListesi.stream().filter(t->t.getId()==aracId);
        System.out.println(Arrays.toString(arabaKontrol.toArray()));

       if (Filo.aracListesi.stream().noneMatch(t->t.getId()==aracId)) {//araç listede olup olmadığı kontrol edildi
           System.out.println("girdiğiniz araç mevcut değil");
       }else if (Filo.aracListesi.stream().anyMatch(t->t.getAracDurumu().equals("Pasif"))){//arac durumu pasi veya aktif kontrol
           System.out.println("Seçilen araç Kiradadır");
       }else System.out.println("işleminiz devam ediyor");
       Filo.aracListesi.stream().filter(t->t.getId()==aracId).forEach(t->t.setAracDurumu("Pasif"));//seçilen aracı pasif yapma
       // System.out.println(Filo.aracListesi.get(1));

    }

    public static void main(String[] args) {
        Menu menu=new Menu();
        menu.aracTalep();
    }





}
