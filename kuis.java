package UKL.Sedang;

import java.util.Random;
import java.util.Scanner;

public class kuis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] operators = { "*", "/", "%" }; // Mendeklarasikan array "operators" yang berisi operator matematika.

        while (true) {
            int bilanganPertama = random.nextInt(100);
            int bilanganKedua = random.nextInt(100);
            String operator = operators[random.nextInt(operators.length)];

            if (operator.equals("/") && bilanganKedua == 0) {
                bilanganKedua = 1; // Menghindari pembagian dengan nol
            }

            System.out.print(bilanganPertama + " " + operator + " " + bilanganKedua + " = ? ");
            String input = scanner.nextLine();
            // menampilakn pertanyaan bilangan prtama dan kdua

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih telah bermain!");
                break;
            }

            double hasil = switch (operator) {
                case "*" -> bilanganPertama * bilanganKedua;
                case "/" -> (double) bilanganPertama / bilanganKedua;
                case "%" -> bilanganPertama % bilanganKedua;
                default -> 0;
            };

            try { // memeriksa jawaban
                double jawabanPengguna = Double.parseDouble(input);
                System.out.println(jawabanPengguna == hasil ? "Jawaban Anda benar!"
                        : "Jawaban Anda salah. Hasil yang benar adalah: " + hasil);
            } catch (NumberFormatException e) {
                System.out.println("Input tidak valid. Silakan masukkan angka atau 'exit' untuk keluar.");
            }
        }

        scanner.close();
    }
}
