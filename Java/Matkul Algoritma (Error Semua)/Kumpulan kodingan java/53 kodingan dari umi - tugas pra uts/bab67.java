import java.util.*;
public class bab67 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		float m, cm, mm;
		double inchi, kaki, yard;

		System.out.println("konversi meter ke inchi, kaki, yard.");
		System.out.println("-----------------");
		System.out.print("masukan panjang benda dalam meter : ");
		m = in.nextInt();
		
		inchi = m/25400;
		kaki = m/3048;
		yard = m/0.9144;
		
		System.out.print("m = " + inchi + " inchi\n");
		System.out.print("m = " + kaki + " kaki\n");
		System.out.print("m = " + yard + " yard\n");
	}
}