import java.util.Scanner;

public class jenisbilanganbulat{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		System.out.print("masukkan angka: ");
		x=scan.nextInt();
		if(x>0)
			System.out.print(x+" adalah bilangan positif");
		else if(x<0)
			System.out.print(x+" adalah bilangan negatif ");
		else
			System.out.print(x+" adalah bilangan nol ");

	}

}