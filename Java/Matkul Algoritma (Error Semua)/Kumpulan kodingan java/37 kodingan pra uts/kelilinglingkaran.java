import java.util.Scanner;
public class kelilinglingkaran {
public static void main(String[] args) {
   int jarijari;
   double keliling;

   Scanner scan = new Scanner(System.in);
   System.out.println("Menghitung Keliling Lingkaran");
   System.out.print("Masukan Jari-Jari: ");
   jarijari = scan.nextInt();
 
   keliling = 6.28 * jarijari;
   System.out.println("Keliling Lingkaran= " +keliling);
    }
}