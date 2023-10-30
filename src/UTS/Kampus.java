package UTS;

public abstract class Kampus {
    String namaKampus, akreditasi;
    Kampus() {
        this.namaKampus = memberiNamaKampus();
        this.akreditasi = memberiAkreditasi();
    }
    public abstract String memberiNamaKampus();
    public abstract String memberiAkreditasi();


}
