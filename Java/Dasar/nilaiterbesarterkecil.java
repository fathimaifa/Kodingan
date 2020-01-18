import java.util.*;
public class nilaiterbesarterkecil {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int nil;
		int max=0;
		int min=24674328;
		int jum=0;
		double rata;

		System.out.print("masukan jumlah data: ");
		double n = in.nextInt();

		for (int i=1; i<=n; i++) {
			System.out.print("masukan sebuah angka: ");
			nil = in.nextInt();
			jum=jum+nil;
			if (nil>max) {
				max=nil;
			}
			if(nil<min){
				min=nil;
			}
		}
		rata = jum/n;
		System.out.println("nilai minimal: " + min);
		System.out.println("nilai maksimal: " + max);
		System.out.println("Rata-rata: " + rata);
	}
}