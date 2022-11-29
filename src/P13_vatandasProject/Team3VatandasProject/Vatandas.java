package JavaProjects.P13_vatandasProject.Team3VatandasProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Vatandas {
    Scanner sc = new Scanner(System.in);
    HashMap<Integer, VatandasBilgileri> vatandasKayıt = new HashMap<>();

    public void saveInfo() {
        System.out.println("kimlik no girin :");
        int kimlikNo = sc.nextInt();
        if (!kimlikNoKontrl(kimlikNo)){
            saveInfo();
        }

        System.out.println("isim ve soy isim giriniz :");
        sc.nextLine();
        String isim = sc.nextLine();
        System.out.println("adres girin :");
        String adres = sc.nextLine();
        System.out.println("tel girin :");
        String tel = sc.nextLine();

        VatandasBilgileri kisi1 = new VatandasBilgileri(isim, adres, tel);
        vatandasKayıt.put(kimlikNo, kisi1);
        selecetOption();

    }


    public void getİnfo() {
        System.out.println("bilgisini istediğiniz kimlik no giriniz :");
        int sorgulananKımlık = sc.nextInt();
        if (vatandasKayıt.containsKey(sorgulananKımlık)) {
            System.out.println(vatandasKayıt.get(sorgulananKımlık));
        } else System.out.println("girdiginiz kimlik no hatalı");


    }

    public void remooooveİnfo() {

        System.out.println("silmmek istediğiniz kimlik no giriniz :");
        int silinecekKımlık = sc.nextInt();
        if (vatandasKayıt.isEmpty()) {
            System.out.println("kayıt listesi boş");
        } else if (vatandasKayıt.containsKey(silinecekKımlık)) {
            System.out.println(vatandasKayıt.get(silinecekKımlık));
            vatandasKayıt.remove(silinecekKımlık);
            System.out.println("istenen kimlik silindi");
        } else {
            System.out.println("girdiginiz kimlik no hatalı");
        }
    }


    public void selecetOption() {
        System.out.println("yapmak istediğiniz işlemi seçin \n kayıt için 1: \n sorgulamak için 2: \n silmek için 3:");
        int islem = sc.nextInt();

        switch (islem) {

            case 1:
                saveInfo();
                selecetOption();
            case 2:
                getİnfo();
                selecetOption();
            case 3:
                remooooveİnfo();
                selecetOption();
            default:
                System.out.println("hatalı giris");
                selecetOption();
        }
    }

    public boolean kimlikNoKontrl(int kimlik){
        boolean flag=true;
        if (kimlik<1000||kimlik>9999){
            System.out.println("4 haneli kimlik no giriniz :");
            flag=false;
            sc.nextLine();
            return flag;

        }
        return flag;
    }


}
