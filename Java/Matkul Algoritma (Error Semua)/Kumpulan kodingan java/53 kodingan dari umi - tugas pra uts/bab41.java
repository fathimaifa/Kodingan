import java.util.*;
public class bab41 {
	 public static void main (String[] args) {
	 	Scanner in = new Scanner (System.in);

	 	String nama, kota;

	 	System.out.print("Halo, Siapa namamu? ");
	 	nama = in.nextLine();
	 	System.out.print("Di kota apa kamu sekarang? ");
	 	kota = in.nextLine();
	 	System.out.print("Senang berteman denganmu, " + nama + ", di kota " + kota);
	 }
}