import java.util.*;
public class whileswitch {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int keluar;
		do{
			int pil, s;
			double hasil;
			System.out.print("1. menghitung luas persegi \n2. menghitung volume kubus \n3. Square root \n4. reciprocal value \njawaban anda: ");
			pil = in.nextInt();

			switch (pil){
				case 1 : 
				System.out.print("\nmasukan sisi persegi: ");
				s = in.nextInt();
				hasil=s*s;
				System.out.print("luas = " + hasil);
				break;

				case 2 :
				System.out.print("\nmasukan sisi kubus: ");
				s = in.nextInt();
				hasil=s*s*s;
				System.out.print("volume = " + hasil);
				break;

				case 3 :
				System.out.print("\nmasukan n: ");
				s = in.nextInt();
				hasil=Math.sqrt(s);
				System.out.print("akar = " + hasil);
				break;

				case 4 : 
				System.out.print("\nmasukan n: ");
				s = in.nextInt();
				hasil=1/s;
				System.out.print("reciprocal = " + hasil);
				break;

			}
			System.out.print("\n\nApakah anda ingin keluar? (y/n) : ");
			keluar = in.next().charAt(0);
		}while(keluar=='n');
	}
}