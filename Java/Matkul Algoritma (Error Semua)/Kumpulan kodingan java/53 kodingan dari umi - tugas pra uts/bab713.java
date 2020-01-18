import java.util.*;
public class bab713 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		int umur;
		
		System.out.print("Masukkan Umur : ");
		umur = in.nextInt();
		
		if (umur > 0 && umur <= 5) {
			System.out.print("Umur : " + umur + " Termasuk Kategori Balita.");
		}else if (umur > 5 && umur <= 12) {
			System.out.print("Umur : " + umur + " Termasuk Kategori Anak-anak.");
		}else if (umur > 12 && umur <= 20) {
			System.out.print("Umur : " + umur + " Termasuk Kategori Remaja.");
		}else if (umur > 20 && umur <= 60) {
			System.out.print("Umur : " + umur + " Termasuk Kategori Dewasa.");
		}else if (umur > 60) {
			System.out.print("Umur : " + umur + " Termasuk Kategori Tua.");
		}
	}
}