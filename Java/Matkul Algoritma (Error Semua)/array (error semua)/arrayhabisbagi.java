import java.util.*;
public class arrayhabisbagi {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		

		System.out.print("masukan baris: ");
		int a = in.nextInt();
		System.out.print("masukan kolom: ");
		int b = in.nextInt();


		int a[][] = new int [4][4];

		for (int i=0; i<a; i++) {
			for (int j=0; j<b; j++) {
				System.out.print("masukan angka: ");
				int a[i][j] = in.nextInt();
			}System.out.print("\n");
		}



	}
}