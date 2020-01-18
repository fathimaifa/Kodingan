import java.util.*;
public class bab64 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		int x, y, z, a;
		System.out.println("PROGRAM PERTUKARAN NILAI BILANGAN X, Y, Z");
		System.out.println("--------------------------");

		System.out.print("masukan nilai x : ");
		x = in.nextInt();
		System.out.print("masukan nilai y : ");
		y = in.nextInt();
		System.out.print("masukan nilai z : ");
		z = in.nextInt();
		 
		//tukar
		a=x;
		x=y;
		y=z;
		z=a;
		
		System.out.print("nilai x = " + x +", nilai y = " + y + " nilai z = " + z); 
	}
}