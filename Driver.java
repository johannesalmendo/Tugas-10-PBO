public class Driver extends Member {
    String plat, jenisMobil;

    public Driver(String nik, String nama, String noTelp, double saldo, String plat, String jenisMobil) {
        super(nik, nama, noTelp, saldo);
        this.plat = plat;
        this.jenisMobil = jenisMobil;
    }

    public String getPlat() {
        return this.plat;
    }

    public void setPlat(String plat) {
        this.plat = plat;
    }

    public String getJenisMobil() {
        return this.jenisMobil;
    }

    public void setJenisMobil(String jenisMobil) {
        this.jenisMobil = jenisMobil;
    }

}
