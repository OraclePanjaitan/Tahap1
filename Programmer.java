// Nama: Oracle Tio Panjaitan
// NIM : 245150400111069

public class Programmer extends Karyawan {
    private double bonus;

    public Programmer(String nama, double gajiPokok, Perusahaan NPerusahaan, double bonus) {
        super(nama, gajiPokok, NPerusahaan);
        this.bonus = bonus;
    }

    @Override
    public double hitungGaji() {
        return super.hitungGaji() + bonus;
    }
}