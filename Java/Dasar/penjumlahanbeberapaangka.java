import java.util.*;
public class penjumlahanbeberapaangka {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jum=0, n, nil;
		System.out.print("masukan berapa banyak angka yang akan dijumlahkan: ");
		n = in.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.print("masukan sebuah angka: ");
			nil = in.nextInt();
			jum=jum+nil;
		}
		System.out.printf("\njumlah = %d" ,jum);
	}
}