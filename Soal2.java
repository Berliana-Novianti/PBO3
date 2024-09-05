import java.util.Scanner; // Mengimpor kelas Scanner untuk membaca input dari pengguna

public class Soal2 {

    public static void main(String[] args) {
        String[] string = new String[3];
        int[] number = new int[3];

        System.out.print("Masukkan string dan integer 3 kali = \n");

        try (Scanner scan = new Scanner(System.in)) {
            for (int i = 0; i < 3; i++) {
                string[i] = scan.next();
                number[i] = scan.nextInt();
                
            }
            for (int i = 0; i < 3; i++) {
                System.out.printf("%-15s%03d%n", string[i], number[i]);
            }
        }
    }
}
