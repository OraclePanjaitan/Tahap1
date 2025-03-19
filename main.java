// Nama: Oracle Tio Panjaitan
// NIM : 245150400111069

public class main {

    public static void main(String[] args) {

        Perusahaan Percetakan = new Perusahaan("PT. Kanisius");

        // Membuat Objek Karyawan
        Karyawan Karyawan = new Karyawan("George Orwell", 5000, Percetakan);  

        // Membuat Objek Programmer
        Programmer Programmer = new Programmer("Harlan Ellison", 6000, Percetakan, 2000);

        // Membuat Objek Manager
        Manager Manager = new Manager("Setyo Wibowo", 7500, Percetakan, 1500, "IT");

        // Menampilkan Data Karyawan
        Karyawan.info();
        Programmer.info();
        Manager.info();

        System.out.println("\n\tHITUNG GAJI");
        Karyawan.infoGaji();
        Programmer.infoGaji();
        Manager.infoGaji();
    }
}
