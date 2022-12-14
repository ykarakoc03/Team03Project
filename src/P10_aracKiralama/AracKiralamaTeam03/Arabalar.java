package JavaProjects.P10_aracKiralama.AracKiralamaTeam03;

public class Arabalar extends Arac {
    double ucret;
    int id;
    static int idNoAtama =1000;
    private String aracDurumu;

    public Arabalar(String marka, String model, String yakit, String vites,double ucret) {
        super(marka, model, yakit, vites);
        id=idNoAtama++;
        aracDurumu="Aktif";
        this.ucret=ucret;
    }

    public int getId() {
        return id;
    }

    public double getUcret() {
        return ucret;
    }

    public void setUcret(double ucret) {
        this.ucret = ucret;
    }

    public String getAracDurumu() {
        return aracDurumu;
    }

    public void setAracDurumu(String aracDurumu) {
        this.aracDurumu = aracDurumu;
    }

    @Override
    public String toString() {
        return "Arabalar{" +
                "ucret=" + ucret +
                ", id=" + id +
                ", aracDurumu='" + aracDurumu + '\'' +
                ", model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yakit='" + yakit + '\'' +
                ", vites='" + vites + '\'' +
                '}';
    }
}