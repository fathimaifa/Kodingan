import java.util.Scanner;

public class konversiangkaketeks {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		System.out.print("Angka: ");
		x = scan.nextInt();
		if(x==1)
			System.out.print("satu");
		else if(x==2)
			System.out.print("dua");
		else if(x==3)
			System.out.print("tiga");
		else if(x==4)
			System.out.print("empat");
		else
				System.out.print("angka yang dimasukkan harus 1 s/d 4");

	}

}