import java.util.*;
public class bab85 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y, z, i;
		
		System.out.print("Solusi Bilangan Bulat Tidak Negatif : x + y + z = 25\n");
		
			
				x = 25/3;
				y = 25/3;
				z = (25/3) + (25%3);
				System.out.print("\nSolusi Pertama =");
				System.out.print("\nx adalah = " +x);
				System.out.print("\ny adalah = " +y);
				System.out.print("\nz adalah = " +z);
		
				x = 25/3;
				y = (25/3) + (25%3);
				z = 25/3;
				System.out.print("\n\nSolusi Kedua =");
				System.out.print("\nx adalah = " +x);
				System.out.print("\ny adalah = " +y);
				System.out.print("\nz adalah = " +z);
		
				x = (25/3) + (25%3);
				y = 25/3;
				z = 25/3;
				System.out.print("\n\nSolusi Ketiga =");
				System.out.print("\nx adalah = " +x);
				System.out.print("\ny adalah = " +y);
				System.out.print("\nz adalah = " +z);
					
		
	}
}