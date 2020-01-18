import java.util.*;
public class bab48 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		double x, p, bunga, jumlah;
		System.out.print("masukan jumlah uang yang anda simpan di bank ini: ");
		x = in.nextInt(); //x = jumlah uang
		System.out.print("masukan bunga yang anda dapatkan: ");
		p = in.nextInt();

		bunga = x*(p/100);
		jumlah = x + bunga;
		System.out.println("jumlah uang tabungan anda setelah ditamba bunga satu tahun adalah: " + jumlah);
	}
}