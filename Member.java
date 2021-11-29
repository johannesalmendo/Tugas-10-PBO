public class Member {
    String nik, nama, noTelp;
    double saldo = 0;

    public Member(String nik, String nama, String noTelp, double saldo) {
        this.nik = nik;
        this.nama = nama;
        this.noTelp = noTelp;
        this.saldo = saldo;
    }

    public String getNik() {
        return this.nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelp() {
        return this.noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
