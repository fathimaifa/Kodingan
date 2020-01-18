import java.util.Scanner;

public class maksimum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int x,y;
		System.out.print("Masukkan bilangan ke-1: ");
		x=scan.nextInt();
		System.out.print("Masukkan bilangan ke-2: ");
		y=scan.nextInt();
		if(x>y){
			System.out.print(x+" adalah Bilangan Terbesar");
		}
		else
		System.out.print(y+" adalah bilangan terbesar");



	}

}