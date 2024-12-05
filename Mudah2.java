package UKL.Mudah;

import java.util.Scanner;

public class ganjilgenap {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Masukkan Bilangan
        System.out.print("Masukkan sebuah bilangan: ");
        int bilangan = scanner.nextInt();

        // Ganjil atau genap?
        if (bilangan % 2 == 0) {
            System.out.println(bilangan + " adalah bilangan genap.");
        } else {
            System.out.println(bilangan + " adalah bilangan ganjil.");
        }

        scanner.close();
    }
}
