package JavaProjects.P04_OkulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiTeam03;

import java.util.List;

import static JavaProjects.P04_OkulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiTeam03.function.*;

public class Control {

    public static void tcKontrol() {
        System.out.print("kimlik no giriniz : ");

        try {
            girilenKimlikNo = scan.nextLong();
            if (girilenKimlikNo < 10000000000l || girilenKimlikNo > 99999999999l) {

                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Tc Kimlik numarası 11 ralamdan oluşmalı");
            scan.nextLine();//dummy
            girisPaneli();
        }
    }

    public static boolean kisiKontrol(List<Personal> liste) {
        boolean flag = false;
        for (Personal k : liste) {
            if (k.getKimlikNo() == girilenKimlikNo) {
                flag =true;
                return flag;
            }
        }
        return flag;
    }

    public static void yasKontrol(int yas) {

        try {
            if ((yas < 7 || yas > 23)&&kisiTuru.equalsIgnoreCase("OGRENCI")) {
                throw new Exception();
            } else if ((yas < 22 || yas > 65)&&kisiTuru.equalsIgnoreCase("OGRETMEN")) {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Hatalı yas girişi yapıldı");
            girisPaneli();
        }
    }

}
