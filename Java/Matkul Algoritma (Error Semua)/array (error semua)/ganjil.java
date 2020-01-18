import java.util.*;
public class ganjil {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int ganjil;

		System.out.print("berapa jumlah bilangan yang ditanya: ");
		int n = in.nextInt();

		int bil[]=new int [n];
		int ganjil[]=new int [n];
		for (int i=0; i<n; i++) {
			System.out.print("masukan bilangan: ");
			bil[i] = in.nextInt();
			if (bil[i]%2==1) {
				bil[i]=ganjil[i];
			}
		}
		for (int i=0; i<n; i++) {
			System.out.print("bilangan ganjil: \n");
			System.out.println(ganjil[i]);
		}
	}
}