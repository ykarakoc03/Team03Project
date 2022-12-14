package JavaProjects.P10_aracKiralama.AracKiralamaTeam03;


    public abstract class Arac {
        String model;
        String marka;
        String yakit;
        String vites;
        public Arac(String marka, String model, String yakit, String vites) {
            this.model = model;
            this.marka = marka;
            this.yakit = yakit;
            this.vites = vites;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getMarka() {
            return marka;
        }

        public void setMarka(String marka) {
            this.marka = marka;
        }

        public String getYakit() {
            return yakit;
        }

        public void setYakit(String yakit) {
            this.yakit = yakit;
        }

        public String getVites() {
            return vites;
        }

        public void setVites(String vites) {
            this.vites = vites;
        }
    }

