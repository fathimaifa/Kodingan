import java.util.*;
public class besar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int max=0, min=898998980;
		int rata, n;
		System.out.print("masukan jumlah bilangan yang akan dimasukan: ");
		n = in.nextInt();
		int bil[]=new int [n];
		for (int i=0; i<n; i++ ) {
			System.out.print("masukan sebuah bilangan: ");
			bil[i] = in.nextInt();
			if (bil[i]<min) {
				min=bil[i];
			}
			if (bil[i]>max) {
				max=bil[i];
			}
		}
		System.out.println("max: "+max);
		System.out.println("min: "+min);
	}
}