package UTS;
public class Proses implements ILulus {
    Siswa siswa; Polinema polinema; UI ui;
    Proses(Polinema polinema, UI ui) {
        this.polinema = polinema;
        this.ui = ui;
    }
    public void passingGrade(int passingGrade){
        if (passingGrade == 80) {
            System.out.println("Nilai Anda masuk dalam Passing Grade ");
        }
        else {
            System.out.println("Nilai Anda tidak masuk dalam Passing Grade ");
        }
    }
    @Override
    public void lulus(Siswa siswa) {
        if (siswa.getPeringkat() < polinema.dayaTampung) {
            System.out.println("==========================================================================");
            System.out.println("Nama           :" + siswa.getNamaSiswa() + "\nDari sekolah   :"
                    + siswa.getAsalSekolah() +"\nNo Pendaftaran :"+siswa.getNoPendaftaran());
            passingGrade(siswa.getNilai());
            System.out.println("dinyatakan LULUS");
            System.out.println(polinema.memberiNamaKampus());
            System.out.println(polinema.memberiAkreditasi());
            polinema.Tes();

        } else if (siswa.getPeringkat() < ui.dayaTampung) {
            System.out.println("==========================================================================");
            System.out.println("Nama           :" + siswa.getNamaSiswa() + "\nDari sekolah   :"
                    + siswa.getAsalSekolah() +"\nNo Pendaftaran :"+siswa.getNoPendaftaran());
            passingGrade(siswa.getNilai());
            System.out.println("dinyatakan LULUS");
            System.out.println(ui.memberiNamaKampus());
            System.out.println(ui.memberiAkreditasi());
            ui.Tes();
        } else if (siswa.getPeringkat() > ui.dayaTampung){
            System.out.println("==========================================================================");
            System.out.println("Nama           :" + siswa.getNamaSiswa() + "\nDari sekolah   :"
                    + siswa.getAsalSekolah() +"\nNo Pendaftaran :"+siswa.getNoPendaftaran());
            passingGrade(siswa.getNilai());
            System.out.println("dinyatakan TIDAK LULUS");
            System.out.println(ui.memberiNamaKampus());
            System.out.println(ui.memberiAkreditasi());
            ui.Tes();
        }
        else if (siswa.getPeringkat() > polinema.dayaTampung){
            System.out.println("==========================================================================");
            System.out.println("Nama           :" + siswa.getNamaSiswa() + "\nDari sekolah   :"
                    + siswa.getAsalSekolah() +"\nNo Pendaftaran :"+siswa.getNoPendaftaran());
            passingGrade(siswa.getNilai());
            System.out.println("dinyatakan TIDAK LULUS");
            System.out.println(polinema.memberiNamaKampus());
            System.out.println(polinema.memberiAkreditasi());
            ui.Tes();
        }

    }

}

