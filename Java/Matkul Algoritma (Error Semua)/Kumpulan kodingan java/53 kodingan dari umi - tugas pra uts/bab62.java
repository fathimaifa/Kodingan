import java.util.*;
public class bab62 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		int tahun, bulan, hari1, hari2;
	
		System.out.println("program penghitung hari pengerjaan proyek");
		System.out.println("----------------------------");
		
		System.out.print("masukan hari pengerjaan proyek : ");
		hari1 = in.nextInt();
		
		tahun = hari1/365;
		bulan = (hari1%365)/30;
		hari2 = (hari1%365)%30;
		
		System.out.println("konversi waktu:");
		System.out.println("Proyek anda dikerjakan selama: " + tahun + " tahun, " + bulan + " bulan, " + hari2 + " hari.");
	}
}