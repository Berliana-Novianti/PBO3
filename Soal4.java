import java.util.Scanner;

public class Soal4{

    public static void main(String[] args) {
        // Buat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan total penjualan bulan ini : \n");
        // Baca jumlah item yang dijual dari pengguna
        int jumlahPenjualan = scanner.nextInt();
        
        // Tutup scanner setelah membaca input
        scanner.close();
        
        // Harga setiap item
        final int hargaItem = 50000;
        
        // Gaji pokok
        final int gajiPokok = 500000;
        
        // Bonus per item
        final double bonusPerItem = 0.10 * hargaItem;
        
        // Variabel untuk menyimpan total gaji
        double totalGaji = gajiPokok;
        
        // Hitung total penjualan
        double totalPenjualan = jumlahPenjualan * hargaItem;
        
        // Hitung bonus penjualan dan denda berdasarkan jumlah penjualan
        if (jumlahPenjualan >= 80) {
            // Bonus 35% dari total penjualan jika menjual lebih dari 80 item
            totalGaji += 0.35 * totalPenjualan;
        } else if (jumlahPenjualan >= 40) {
            // Bonus 25% dari total penjualan jika menjual minimal 40 item
            totalGaji += 0.25 * totalPenjualan;
        }
        
        // Hitung bonus untuk setiap item yang dijual
        totalGaji += jumlahPenjualan * bonusPerItem;
        
        // Hitung denda jika menjual di bawah 15 item
        if (jumlahPenjualan < 15) {
            // Total item yang kurang dari 15 item
            int itemKurang = 15 - jumlahPenjualan;
            // Denda sebesar 15% dari total penjualan item yang kurang
            double denda = 0.15 * itemKurang * hargaItem;
            totalGaji -= denda;
        }
        
        // Cetak total gaji yang diterima
        System.out.println((int) totalGaji);
    }
}
