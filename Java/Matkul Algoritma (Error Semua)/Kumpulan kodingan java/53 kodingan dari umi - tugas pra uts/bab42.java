import java.util.*;
public class bab42 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		int sisi, alas, tinggi, sa, sb, luas;

		//luas bujursangkar
		System.out.println("\nLUAS BUJURSANGKAR");
		System.out.print("masukan panjang sisi: ");
		sisi = in.nextInt();

		luas = sisi*sisi;
		System.out.println("luas bujursangkar = " + luas);

		//luas segitiga
		System.out.println("\nLUAS SEGITIGA");
		System.out.print("masukan panjang alas segitiga: ");
		alas = in.nextInt();
		System.out.print("masukan panjang tinggi segitiga: ");
		tinggi = in.nextInt();

		luas = (alas*tinggi)/2;
		System.out.println("luas segitiga = " + luas);

		//luas trapesium
		System.out.println("\nLUAS TRAPESIUM");
		System.out.print("masukan panjang sisi atas: ");
		sa = in.nextInt();
		System.out.print("masukan panjang sisi bawah: ");
		sb = in.nextInt();
		System.out.print("masukan tinggi trapesium: ");
		tinggi = in.nextInt();

		luas = ((sa+sb)*tinggi)/2;
		System.out.println("luas trapesium = " + luas);


	}
}