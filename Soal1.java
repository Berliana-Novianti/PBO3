import java.util.Scanner;

public class Soal1 {
  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan teks = ");
        // membaca inout string
        String inputan = input.nextLine();
        
        // Menggunakan regex untuk memisahkan berdasarkan karakter non-huruf
        String[] tokens = inputan.trim().split("[^a-zA-Z]+");
        
        // Jika string kosong setelah di-trim, cetak 0
        if (inputan.trim().isEmpty()) {
            System.out.println(0);
        } else {
            // Cetak jumlah token
            System.out.println(tokens.length);
            
            // Cetak setiap token pada baris baru
            for (String token : tokens) {
                System.out.println(token);
            }
        }
        
    }
    
}