import java.util.*;

public class MahasiswaHashMap {
    public static void main(String[] args) {

//        LIST AREA
        Map<Integer, String> mahasiswa1 = new HashMap<>(3);
        Map<Integer, String> mahasiswa2 = new HashMap<>(3);
        Map<Integer, String> mahasiswa3 = new HashMap<>(3);

//        MahasiswaArrayList 1
        mahasiswa1.put(1,"145410071");
        mahasiswa1.put(2,"Cokro Yongky Pranowo");
        mahasiswa1.put(3,"Kalimantan Barat");

//        MahasiswaArrayList 1
        mahasiswa1.put(1,"145410080");
        mahasiswa1.put(2,"Ridha Naufal");
        mahasiswa1.put(3,"Purworejo");

//        MahasiswaArrayList 1
        mahasiswa1.put(1,"145410085");
        mahasiswa1.put(2,"Fajar Setya Pratama");
        mahasiswa1.put(3,"Pacitan");


        System.out.println("====================\nHASH MAP Data Sebelum Diremove AREA\n====================\n");
        System.out.println("Data mahasiswa 1");
        for(Map.Entry<Integer, String> entry : mahasiswa1.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key :"+key+"\n"+"Value :"+value);
        }
        System.out.println("\n\nData mahasiswa 2");
        for(Map.Entry<Integer, String> entry : mahasiswa2.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key :"+key+"\n"+"Value :"+value);
        }
        System.out.println("\n\nData mahasiswa 2");
        for(Map.Entry<Integer, String> entry : mahasiswa3.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key :"+key+"\n"+"Value :"+value);
        }
        System.out.println("====================\nHash MAP Data Sebelum Diremove AREA\n====================\n");

//        Hapus semua data alamat
        mahasiswa1.remove(2);
        mahasiswa2.remove(2);
        mahasiswa3.remove(2);
        System.out.println("====================\nHASH MAP Data Setelah diremove\n====================\n");
        System.out.println("Data mahasiswa 1");
        for(Map.Entry<Integer, String> entry : mahasiswa1.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key :"+key+"\n"+"Value :"+value);
        }
        System.out.println("\n\nData mahasiswa 2");
        for(Map.Entry<Integer, String> entry : mahasiswa2.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key :"+key+"\n"+"Value :"+value);
        }
        System.out.println("\n\nData mahasiswa 2");
        for(Map.Entry<Integer, String> entry : mahasiswa3.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key :"+key+"\n"+"Value :"+value);
        }
        System.out.println("====================\nHASH MAP Data Setelah diremove\n====================\n");

    }
}
