import java.util.*;
public class lingkaranvoid {
	public static void luas(int r) {
		double luas = r*r*3.14;
		System.out.println(luas);
	}
	
	public static void keliling(int r) {
		double keliling = r*6.28;
		System.out.println(keliling);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("masukan jari-jari lingkaran: ");
		int r = in.nextInt();

		System.out.print("luas lingkaran: ");
		luas(r);

		System.out.print("keliling lingkaran: ");
		keliling(r);
	}
}