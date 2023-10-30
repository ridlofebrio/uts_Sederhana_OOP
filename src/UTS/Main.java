package UTS;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Polinema polinema = new Polinema();
        UI ui = new UI();
        Proses proses = new Proses(polinema, ui);
        Scanner scanner = new Scanner(System.in);
        Siswa siswa1 = new Siswa();
        siswa1.setNamaSiswa("Budi");
        siswa1.setNoPendaftaran("123");
        siswa1.setPeringkat(1);
        siswa1.setNilai(100);
        siswa1.setAsalSekolah("SMKN 1 Malang");
        Siswa siswa2 = new Siswa();
        siswa2.setNamaSiswa("Toni");
        siswa2.setNoPendaftaran("456");
        siswa2.setNilai(87);
        siswa2.setPeringkat(200);
        siswa2.setAsalSekolah("SMAN 1 Malang");

        do {
            System.out.print("Masukkan No Pendaftaran :");
            String noPendaftaran = scanner.nextLine();
            if (noPendaftaran.equals(siswa1.getNoPendaftaran())) {
                proses.lulus(siswa1);
            } else if (noPendaftaran.equals(siswa2.getNoPendaftaran())) {
                proses.lulus(siswa2);
            } else {
                System.out.println("No Pendaftaran tidak ditemukan");
            }
            System.out.print("Apakah anda ingin melanjutkan? (y/n)");
            if (scanner.nextLine().equals("n")) {
                break;
            }
        }while (true);



    }
}
