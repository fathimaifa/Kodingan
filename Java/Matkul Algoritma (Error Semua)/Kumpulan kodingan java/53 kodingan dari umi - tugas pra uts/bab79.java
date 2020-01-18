import java.util.*;
public class bab79 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		double bb, bb1, tb, x, a, b;
		//x adalah rumus sementara, untuk mempermudah penulisan rumus berat badan ideal
		
		System.out.println("PROGRAM PENGHITUNG BERAT BADAN IDEAL");
		System.out.println("-------------------");

		System.out.print("masukan tinggi badan anda : ");
		tb = in.nextInt();
		System.out.print("masukan berat badan anda : ");
		bb1 = in.nextInt();
		
		x = tb - 100;
		bb = x-(0.1*x);
		
		System.out.println("berat badan yang ideal untuk tinggi badan anda adalah : "+ bb);
		
		a=bb-2;
		b=bb+2;
		if((a<bb1)&&(b>bb1))
			System.out.println("berat badan anda ideal");
		else 
			System.out.println("berat badan anda tidak ideal");
	}
}