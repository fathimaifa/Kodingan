import java.util.*;
public class latarray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jum=0;
		float rata, n;
		System.out.print("masukan jumlah bilangan yang akan dimasukan: ");
		n = in.nextInt();
		int bil[]=new int [n];
		for (int i=0; i<n; i++ ) {
			System.out.
			print("masukan sebuah bilangan: ");
			bil[i] = in.nextInt();
			jum=jum+bil[i];
		}
		rata=jum/n;
		System.out.print("rata: "+rata);
	}
}