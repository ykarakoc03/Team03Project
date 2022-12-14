package JavaProjects.P10_aracKiralama.AracKiralamaTeam03;

public class Kisi {
    String kimlikNo;
    String ad;
    String soyad;
    String telefon;
    String adres;

    public Kisi() {
    }

    public Kisi(String kimlikNo, String ad, String soyad, String telefon, String adres) {
        this.kimlikNo = kimlikNo;
        this.ad = ad;
        this.soyad = soyad;
        this.telefon = telefon;
        this.adres = adres;
    }


    public String getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getMail() {
        return adres;
    }

    public void setMail(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Kisinin: " +
                "kimlikNo='" + kimlikNo + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", telefon='" + telefon + '\'' +
                ", adres='" + adres + '\'' ;
    }
}
