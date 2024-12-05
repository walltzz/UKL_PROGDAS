package UKL.Sulit;

import java.util.HashSet;

public class cekduplikat {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 2, 5 };
        cekDuplikat(array);
    }

    public static void cekDuplikat(int[] array) {
        HashSet<Integer> set = new HashSet<>();
        boolean adaDuplikat = false;

        System.out.print("Array: {");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + (i < array.length - 1 ? ", " : ""));
        }
        System.out.println("}");

        for (int num : array) {
            if (!set.add(num)) {
                System.out.println("Array memiliki elemen duplikat: " + num);
                adaDuplikat = true;
            }
        }

        if (!adaDuplikat) {
            System.out.println("Array tidak memiliki elemen duplikat.");
        }
    }
}