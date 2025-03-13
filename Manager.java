// Nama: Oracle Tio Panjaitan
// NIM : 245150400111069

public class Manager extends Karyawan {
    private double insentif;
    private String divisi;

    public Manager(String nama, double gajiPokok, Perusahaan NPerusahaan, double insentif, String divisi) {
        super(nama, gajiPokok, NPerusahaan);
        this.insentif = insentif;
        this.divisi = divisi;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + insentif;
    }   
}