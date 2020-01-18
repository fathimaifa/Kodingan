import java.util.Scanner;

public class ganjilgenap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		 
		int x;
		System.out.print("Masukkan bilangan: ");
		x=scan.nextInt();
		if(x%2==0){
			System.out.print(x+" adalah Bilangan Genap");
		}
		else
		System.out.print(x+" adalah Bilangan Ganjil");
	}
}