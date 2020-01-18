import java.util.*;
public class bab68 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		double bb, tb, x;
		//x adalah rumus sementara, untuk mempermudah penulisan rumus berat badan ideal
		
		System.out.println("PROGRAM PENGHITUNG BERAT BADAN IDEAL");
		System.out.println("-------------------");
		System.out.print("masukan tinggi badan anda : ");
		tb = in.nextInt();
		
		x = tb - 100;
		bb = x-(0.1*x);
		
		System.out.println("berat badan yang ideal untuk tinggi badan anda adalah : " + bb);

	}
}