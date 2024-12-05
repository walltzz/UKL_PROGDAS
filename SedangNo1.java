package UKL.Sedang;

import java.util.Scanner;

public class hitungfaktorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta input dari pengguna
        System.out.print("Masukkan bilangan bulat positif: ");
        int bilangan = scanner.nextInt();

        // Memastikan input adalah bilangan bulat positif
        if (bilangan < 0) {
            System.out.println("Input harus bilangan bulat positif.");
        } else {
            long faktorial = hitungFaktorial(bilangan);
            System.out.println("Faktorial dari " + bilangan + " adalah: " + faktorial);
        }

        scanner.close();
    }

    // Menghitung faktorial
    public static long hitungFaktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }
}
