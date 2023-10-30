package UTS;

public class Siswa {
    private String namaSiswa, asalSekolah, noPendaftaran;
    private int peringkat, nilai;
    Siswa() {
    }
    public void setAsalSekolah(String asalSekolah) {
        this.asalSekolah = asalSekolah;
    }
    public void setNoPendaftaran(String noPendaftaran) {this.noPendaftaran = noPendaftaran;}
    public void setNilai(int nilai) {this.nilai = nilai;}
    public void setPeringkat(int peringkat) {this.peringkat = peringkat;}
    public int getPeringkat() {return peringkat;}
    public void setNamaSiswa(String namaSiswa) {
        this.namaSiswa = namaSiswa;
    }
    public String getNamaSiswa() {
        return this.namaSiswa;
    }
    public String getAsalSekolah() {
        return this.asalSekolah;
    }
    public String getNoPendaftaran() {
        return noPendaftaran;
    }
    public int getNilai() {return nilai;}
}

