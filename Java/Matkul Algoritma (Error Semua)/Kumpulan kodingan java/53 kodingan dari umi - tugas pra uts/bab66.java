import java.util.*;
public class bab66 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int x, km, m, cm;

		System.out.println("PERJALANAN SEEKOR SEMUT");
		System.out.println("--------------------");
		System.out.print("semut berjalan sejauh (cm): ");
		x = in.nextInt();
		
		km = x/100000;
		m = (x%100000)/1000;
		cm = ((x%100000)%1000);
		
		System.out.println("perjalanan semut = " + km + " km + " + m + " m + " + cm + " cm.");
	}
}