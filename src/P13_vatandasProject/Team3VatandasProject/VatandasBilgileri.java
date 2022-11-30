package JavaProjects.P13_vatandasProject.Team3VatandasProject;

public class VatandasBilgileri {

    String isim;
    String ades;
    String tel;
    int kimlikNo;

    public VatandasBilgileri(String isim, String ades, String tel ) {
        this.isim = isim;
        this.ades = ades;
        this.tel = tel;
        //this.kimlikNo = kimlikNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getAdes() {
        return ades;
    }

    public void setAdes(String ades) {
        this.ades = ades;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getKimlikNo() {
        return kimlikNo;
    }

    public void setKimlikNo(int kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    @Override
    public String toString() {
        return "VatandasBilgileri{" +
                "isim='" + isim + '\'' +
                ", ades='" + ades + '\'' +
                ", tel='" + tel
               ;
    }
}
