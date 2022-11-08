public class Main {
    public static void main(String[] args) throws Exception {
        Tendik karyawan1 = new Tendik(505,"Aldi", "Lombok","23-sept-2005","Laki-Laki", 2021);
        karyawan1.display();
        karyawan1.waktuLembur(20);
        karyawan1.setUangLembur(0);
        karyawan1.displaygaji();
        System.out.println();
        System.out.println();
        System.out.println();

        Dosen dosen1 = new Dosen(444, "Roi", "wates","03-maret-2001" , "Laki-Laki", 2002);
        dosen1.setNomorIndukDosen(987123);
        dosen1.setJurusan("Informatika");
        dosen1.display();
        dosen1.displayDosen_Jurusan();
        dosen1.waktuLembur(6);
        dosen1.displaygaji();
    }
}