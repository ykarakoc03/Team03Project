package JavaProjects.ClaruswayStore;

import java.util.Scanner;

public class Store {
    Scanner scanner = new Scanner(System.in);
    public void run (){
        System.out.println("Clarusway Store Management Paneline Hpşgeldiniz...");
        System.out.println("1 Notebook İşlemleri\n"+
                "2 Marka Listeleme \n" +
                "3 Çıkış yap \n");
        System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz : ");
        switch (scanner.nextInt()){
            case 1:
                Notebook notebook = new Notebook();
                notebook.menu();
                break;
            case 2:
                Brand.printBrands();
                run();
                break;
            case 3:
                System.out.println("Çıkış Yapılıyor...");
                System.exit(0);
                break;
        }


    }
}
