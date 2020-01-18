import java.util.*;
public class bab61 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		int hari, detik, menit, jam;

		System.out.print("masukan detik : ");
		detik = in.nextInt();
		
		hari = detik/86400;
		jam = (detik%86400)/3600;
		menit = ((detik%86400)%3600)/60;
		detik = ((detik%86400)%3600)%60;
		
		System.out.println(hari + " hari, " + jam + " jam, " + menit + " menit, " + detik + " detik.");
	}
}