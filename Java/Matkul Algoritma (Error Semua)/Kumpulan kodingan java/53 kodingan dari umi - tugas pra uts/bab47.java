import java.util.*;
public class bab47 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		double harga, total, diskon;
		System.out.print("masukan harga barang yang anda beli: ");
		harga = in.nextInt();

		diskon = harga*0.05;
		total = harga - diskon;
		System.out.println("anda mendapatkan diskon sebesar 5%, sehingga total belanja anda menjadi: " + total);
	}
}