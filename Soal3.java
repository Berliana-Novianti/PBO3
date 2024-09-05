import java.util.Scanner;

public class Soal3 {

    public static void main(String[] args) {
        // Buat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang akan dihitung = \n");
        // Baca seluruh baris input
        String input = scanner.nextLine();
        
        // Tutup scanner
        scanner.close();
        
        // Pisahkan input menjadi bagian-bagian
        String[] parts = input.split(" ");
        
        // Ambil A, operator, dan B dari array parts
        int A = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int B = Integer.parseInt(parts[2]);
        
        // Variabel untuk menyimpan hasil
        int result = 0;
        
        // Lakukan operasi sesuai operator
        switch (operator) {
            case "+":
                result = A + B;
                break;
            case "-":
                result = A - B;
                break;
            case "*":
                result = A * B;
                break;
            case "/":
                result = A / B;
                break;
            case "%":
                result = A % B;
                break;
            default:
                // Jika operator tidak valid (tidak akan terjadi berdasarkan batasan soal)
                throw new IllegalArgumentException("Operator tidak dikenal: " + operator);
        }
        System.out.print("hasil = ");
        // Cetak hasil
        System.out.println(result);
    }
}
