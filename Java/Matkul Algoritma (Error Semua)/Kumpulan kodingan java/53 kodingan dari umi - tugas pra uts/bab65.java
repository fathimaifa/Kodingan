import java.util.*;
public class bab65 {
	public static void main (String[] args) {
		int nilai, seribu, maratus, seratus, mapuluh, dualima;
		Scanner in = new Scanner (System.in);
	
		System.out.println("PROGRAM PENGUBAH NILAI KELIPATAN RUPIAH");
		System.out.println("------------------------------");
		System.out.print("masukan nilai uang (rupiah) : ");
		nilai = in.nextInt();
		
		seribu  = nilai/1000;
		maratus = (nilai%1000)/500;
		seratus = ((nilai%1000)%500)/100;
		mapuluh = (((nilai%1000)%500)%100)/50;
		dualima = ((((nilai%1000)%500)%100)%50)/25;
		
		System.out.println("uang anda setara dengan pecahan: ");
		System.out.println(seribu + " buah pecahan 1000, " + maratus + " buah pecahan 500, " +
		seratus + " buah pecahan 100, " + mapuluh + " buah pecahan 50, " + dualima + " buah pecahan 25. ");
	}
}