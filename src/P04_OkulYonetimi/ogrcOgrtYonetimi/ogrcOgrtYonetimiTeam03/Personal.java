package JavaProjects.P04_OkulYonetimi.ogrcOgrtYonetimi.ogrcOgrtYonetimiTeam03;

public class Personal {

    private String adSoyad;
    private long kimlikNo;
    private int yas;

    public Personal() {

    }

    public Personal(String adSoyad, long kimlikNo, int yas) {
        setAdSoyad(adSoyad);
        this.kimlikNo = kimlikNo;
        setYas(yas);
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad.toUpperCase();
    }

    public long getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(long kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if (yas < 0) {
            this.yas = -yas;
        } else
            this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "| kimlikNo= " + kimlikNo +
                "| adSoyad= " + adSoyad +
                "| yas=" + yas;
    }
}





