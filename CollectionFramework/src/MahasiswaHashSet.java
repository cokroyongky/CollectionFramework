import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MahasiswaHashSet {
    public static void main(String[] args) {

//        LIST AREA
        Set<String> mahasiswa1 = new HashSet<>();
        Set<String> mahasiswa2 = new HashSet<>();
        Set<String> mahasiswa3 = new HashSet<>();

//        MahasiswaArrayList 1
        mahasiswa1.add("145410071");
        mahasiswa1.add("Cokro Yongky Pranowo");
        mahasiswa1.add("Kalimantan Barat");

//        MahasiswaArrayList 2
        mahasiswa2.add("145410080");
        mahasiswa2.add("Ridha Naufal");
        mahasiswa2.add("Purworejo");

//        MahasiswaArrayList 3
        mahasiswa3.add("145410082");
        mahasiswa3.add("Fajar Setia Pratam");
        mahasiswa3.add("Pacitan");


        System.out.println("====================\nHASH SET Data Sebelum Diremove AREA\n====================\n");
        System.out.println("Data mahasiswa 1");
        for (String temp1 : mahasiswa1) {
            System.out.println(temp1);
        }
        System.out.println("\n\nData mahasiswa 2");
        for (String temp2 : mahasiswa2) {
            System.out.println(temp2);
        }
        System.out.println("\n\nData mahasiswa 2");
        for (String temp3 : mahasiswa2) {
            System.out.println(temp3);
        }
        System.out.println("====================\nHash Set Data Sebelum Diremove AREA\n====================\n");

//        Hapus semua data alamat
        mahasiswa1.remove(2);
        mahasiswa2.remove(2);
        mahasiswa3.remove(2);
        System.out.println("====================\nHASH SET Data Setelah diremove\n====================\n");
        System.out.println("Data mahasiswa 1");
        for (String temp1 : mahasiswa1) {
            System.out.println(temp1);
        }
        System.out.println("\n\nData mahasiswa 2");
        for (String temp2 : mahasiswa2) {
            System.out.println(temp2);
        }
        System.out.println("\n\nData mahasiswa 2");
        for (String temp3 : mahasiswa2) {
            System.out.println(temp3);
        }
        System.out.println("====================\nHASH SET Data Setelah diremove\n====================\n");



    }
}
