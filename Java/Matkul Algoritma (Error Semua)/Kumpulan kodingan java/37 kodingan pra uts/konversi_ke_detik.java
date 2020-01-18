import java.util.*;
public class konversi_ke_detik {
	public static void main (String[]args) {
		int jam;
		int menit;
		int detik;
		double totaldetik;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan jam : ");
		jam = in.nextInt();
		System.out.print("masukan menit : ");
		menit = in.nextInt();
		System.out.print("masukan detik : ");
		detik = in.nextInt();

		//menampilkan jam, menit, detik
		System.out.println(jam + ":" + menit + ":" + detik);

		//konversi ke detik
		jam = jam*3600;
		menit = menit*60;
		
		totaldetik = jam + menit + detik;

		System.out.println("Total Detik = " +totaldetik);

	}
}