import java.util.*;
public class bab46 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		double alas, tinggi, luas;

		System.out.print("masukan panjang alas segitiga: ");
		alas = in.nextInt();
		System.out.print("masukan panjang tinggi segitiga: ");
		tinggi = in.nextInt();

		luas = (alas*tinggi)/2;
		System.out.println("\nmaka luas segitiga tersebut adalah: " + luas);
	}
}