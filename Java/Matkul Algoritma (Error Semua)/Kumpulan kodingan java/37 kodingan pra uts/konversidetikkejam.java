import java.util.*;
public class konversidetikkejam {
	public static void main (String[]args) {
		int jam;
		int menit;
		int detik;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan jumlah detik : ");
		detik = in.nextInt();

		//konversi ke detik
		jam = detik/3600;
		menit = (detik%3600)/60;
		detik = (detik%3600)%60;

		//hasil
		System.out.println(detik + " = " + jam + ":" + menit + ":" + detik);

	}
}