import java.math.BigInteger;
import java.util.Scanner;

public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        BigInteger A = sc.nextBigInteger();
        BigInteger B = sc.nextBigInteger();
        
        System.out.println("Hasil penjumlahan: " + A.add(B));
        
        System.out.println("Hasil perkalian: " + A.multiply(B));
        
        sc.close();
    }
}