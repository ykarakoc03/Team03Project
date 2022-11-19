package JavaProjects.P04_OkulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiTeam03;

public class Student extends Personal {

    private static int no=100;
    private int ogrcNo;
    private String sınıf;

    public Student(String adSoyad, long kimlikNo, int yas, String sınıf) {
        super(adSoyad, kimlikNo, yas);
        ogrcNo= no++;
        this.sınıf = sınıf;
    }

    public int getOgrcNo() {
        return ogrcNo;
    }


    public String getSınıf() {
        return sınıf;
    }

    @Override
    public String toString() {
        return  "| Ogrencinin; " + super.toString() +
                "| ogrcNo= " + ogrcNo  +
                "| sınıf= " + sınıf +
                "| ";
    }

}
