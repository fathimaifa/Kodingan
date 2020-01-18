import java.util.Scanner;

public class maksimum3{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int x,y,z,max;
		System.out.print("Masukkan bilangan ke-1: ");
		x=scan.nextInt();
		System.out.print("Masukkan bilangan ke-2: ");
		y=scan.nextInt();
		System.out.print("Masukkan bilangan ke-3: ");
		z=scan.nextInt();
		if(x>y){
			max=x;
		}
		else
			max=y;
		if(z>max)
			max=z;
		
		System.out.print("Bilangan terbesar: "+max);

	}

}
