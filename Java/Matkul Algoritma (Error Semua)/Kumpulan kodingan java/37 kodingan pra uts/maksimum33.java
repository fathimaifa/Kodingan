import java.util.Scanner;

public class maksimum33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int x,y,z,max;
		System.out.print("Masukkan bilangan ke-1: ");
		x=scan.nextInt();
		System.out.print("Masukkan bilangan ke-2: ");
		y=scan.nextInt();
		System.out.print("Masukkan bilangan ke-3: ");
		z=scan.nextInt();
		
		if(x>y && x>z)
				System.out.print("Bilangan terbesar: "+x);
		else if(y>x && y>z)
			System.out.print("Bilangan terbesar: "+y);
		else
			System.out.print("Bilangan terbesar: "+z);



	}

}