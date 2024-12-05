package UKL.Sulit;

import java.util.HashMap;
import java.util.Map;

public class hitungfrekuensi {
    public static void main(String[] args) {
        int[] array = { 1, 2, 2, 3, 3, 3, 4 };

        // Memanggil metode untuk menghitung frekuensi
        Map<Integer, Integer> frekuensi = hitungFrekuensi(array);

        // Menampilkan hasil
        System.out.println("Frekuensi setiap elemen dalam array:");
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) {
            System.out.println("Elemen " + entry.getKey() + " muncul " + entry.getValue() + " kali.");
        }
    }

    public static Map<Integer, Integer> hitungFrekuensi(int[] array) {
        Map<Integer, Integer> frekuensiMap = new HashMap<>();

        for (int elemen : array) {
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1);
        }

        return frekuensiMap;
    }
}
