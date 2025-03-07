// Nama: Oracle Tio Panjaitan
// NIM : 245150400111069

public class main {

    public static void main(String[] args) {

        // Membuat Objek Perusahaan
        Perusahaan Percetakan = new Perusahaan("PT. Kanisius");

        // Membuat Objek Karyawan
        Karyawan Operator = new Karyawan("George Orwell", 5000, Percetakan);  
        Karyawan Manager = new Karyawan("Setyo Wibowo", 7500, Percetakan);
        Karyawan Supervisor = new Karyawan("Harlan Ellison", 6000, Percetakan);

        // Menampilkan Data Karyawan
        Operator.info();
        Manager.info();
        Supervisor.info();
    }
}
