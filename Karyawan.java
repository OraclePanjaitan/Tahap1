// Nama: Oracle Tio Panjaitan
// NIM : 245150400111069

public class Karyawan{
    // Atribut
    private String nama;
    private double gajiPokok;
    private Perusahaan NPerusahaan;

    // Konstruktor
    Karyawan(String nama, double gajiPokok, Perusahaan NPerusahaan ) {
        setNama(nama);
        this.gajiPokok = gajiPokok;
        this.NPerusahaan = NPerusahaan; 
    }

    public void setNama(String nama){
        if(nama.length() <4){
            System.out.println("Nama Terlalu Pendek");
        }
        else{
            this.nama = nama;
        }
    }

    // Method Info Menampilkan Informasi Karyawan 
    public void info(){
        System.out.printf("Nama       : %s\n", nama);
        System.out.println("Gaji Pokok : " + Util.formatRupiah(gajiPokok));
        System.out.printf("Perusahaan : %s\n\n", NPerusahaan.getNamaPerusahaan());
    }

    public double hitungGaji(){
        double totalGaji = gajiPokok;
        return totalGaji;
    }

    public void infoGaji() {
        System.out.printf("Nama       : %s\n", nama);
        System.out.printf("Total Gaji : $ %.2f\n\n", hitungGaji());
    }
}