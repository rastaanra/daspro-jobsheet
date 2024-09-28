import java.util.Scanner;
public class PemilihanBilanganModifikasi19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan sebuah angka: ");
        int angka = sc.nextInt();

        String hasil;
        hasil =(angka > 0.0) ? "bilangan positif" : "ilangan Negatif";
        System.out.println(angka + " Adalah " + hasil);


    }
}