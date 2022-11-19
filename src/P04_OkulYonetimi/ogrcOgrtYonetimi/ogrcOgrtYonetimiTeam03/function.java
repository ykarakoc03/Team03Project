package JavaProjects.P04_OkulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiTeam03;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static JavaProjects.P04_OkulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiTeam03.Control.*;

public class function {

    static List<Personal> studendListesi = new ArrayList<>();
    static List<Personal> teacherListesi = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static long girilenKimlikNo;
    static String kisiTuru;
    public static final String W = "\u001B[37m";
    public static final String R = "\u001B[31m";
    public static final String G = "\u001B[32m";
    public static final String Y = "\u001B[33m";
    public static final String B = "\u001B[34m";

    public static void girisPaneli() {
        System.out.println(R + "**********************************    " + Y + " \nOGRENCI VE OGRETMEN YONETIM PANELI\n" + G + "**********************************");
        System.out.println(B + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS ");
        System.out.print("Lutfen yapmak istediginiz islemi giriniz : ");
        String secim = scan.nextLine().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu(studendListesi);
                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu(teacherListesi);
                break;

            case "Q":
                cıkıs();
                break;
            default:
                System.out.println("hatalı giriş yaptınız  :(");
                girisPaneli();//recursive method call
                break;


        }


    }

    private static void cıkıs() {
        System.out.println("Cikis yapildi");
    }

    public static void islemMenusu(List<Personal> liste) {

        System.out.println("Sectiginiz kisi turu: " + kisiTuru + ", Lutfen asagidaki islemlerden tercih yapiniz.\n"
                + R + "*********** " + kisiTuru + " ISLEMLER ************\n" + B + " 1-EKLEME\n 2-ARAMA\n 3-LISTELEME\n 4-SILME\n 0-ANA MENU");
        System.out.print(B + "Islem Tercihiniz : ");

        int secilenIslem = scan.nextInt();
        scan.nextLine();
        boolean silsinMi = false;
        switch (secilenIslem) {
            case 1:
                ekle(liste);
                islemMenusu(liste);
                break;
            case 2:
                System.out.println(R + "   ***   " + kisiTuru + " arama sayfası   ***" + B);
                silsinMi = false;
                aramaSilme(liste, silsinMi);
                islemMenusu(liste);
                break;
            case 3:
                listele(liste);
                islemMenusu(liste);
                break;
            case 4:
                System.out.println(R + "   ***   " + kisiTuru + " silme sayfası   ***" + B);
                silsinMi = true;
                aramaSilme(liste, silsinMi);
                islemMenusu(liste);
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("Yanlış giriş yapıldı. Lütfen tekrar deneyiniz  ");
                islemMenusu(liste);

                break;
        }

    }

    private static void aramaSilme(List<Personal> liste, Boolean silsinMi) {
        tcKontrol();
        if (!kisiKontrol(liste)) {
            System.out.println("Girdiğiniz Tc numarasına ait bir kayıt mevcut değil");
        } else {
            for (Personal k : liste) {
                if (k.getKimlikNo() == (girilenKimlikNo)) {
                    System.out.println(k);
                    if (silsinMi) {
                        liste.remove(k);
                        System.out.println("Girdiğiniz Tc numarasına ait bir kayıt silindi. ");
                    }
                    break;
                }
            }
        }
    }


        private static void listele (List < Personal > liste) {

        System.out.println(B + "   ***   " + kisiTuru + " listeleme sayfası   ***" + R);

            for (Personal k : liste) {
                System.out.println(k.toString());
                System.out.println("-----------------------------------------------" +
                        "------------------------------------------");
            }

        }


        private static void ekle (List < Personal > liste) {
            tcKontrol();//tc alınıp kontrol ediliyor
            if ((kisiKontrol(teacherListesi) || (kisiKontrol(studendListesi)))) {
                System.out.println("Girdiğiniz kimlik numarası ile mevcut bir kayıt bulunmaktadır.Kimlik numaranızı kontrol ediniz");
                islemMenusu(liste);
            }
            System.out.print("ad soyad giriniz : ");
            scan.nextLine();//dummy hayalet komut
            String adSoyad = scan.nextLine();
            System.out.print("yas giriniz : ");
            int yas = scan.nextInt();
            Control.yasKontrol(yas);

            if (kisiTuru.equals("OGRENCI")) {
                scan.nextLine();//dummy --> hayalet komut--> iki tane eşit scan.next(); komutu ayırmak için araya girmeli
                System.out.print("sınıf giriniz : ");
                String sınıf = scan.nextLine();
                Student student = new Student(adSoyad, girilenKimlikNo, yas, sınıf);//p'li cons ogrc obj create edildi
                studendListesi.add(student);

            } else {//kisiTuru öğrenci ise if çalısir değilse kisiTuru öğretmen demektir ki else body çalışır
                scan.nextLine();//dummy
                System.out.print("sicil No giriniz : ");
                String sicilNo = scan.nextLine();
                System.out.print("bolum giriniz : ");
                String bolum = scan.nextLine();
                Teacher ogretmen = new Teacher(adSoyad, girilenKimlikNo, yas, bolum, sicilNo);//p'li cons ogrtm obj create edildi
                teacherListesi.add(ogretmen);
            }

        }

    }
