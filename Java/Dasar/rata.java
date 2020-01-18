import java.util.*;
public class rata {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double n, rata;
		int jum=0;
		System.out.print("Masukan banyaknya nilai: ");
		n = in.nextInt();
		for (int i=0; i<n; i++) {
			System.out.print("Masukan nilai: ");
			int nil = in.nextInt();
			jum=jum+nil;
		}
		rata=jum/n;
		System.out.print("rata-rata: " + rata);
	}
}