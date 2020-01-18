import java.util.Scanner;

public class konversiangkaketekscase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		System.out.print("Angka: ");
		x = scan.nextInt();
		
		switch(x){
		case 1: System.out.print("satu");break;
		case 2: System.out.print("dua");break;
		case 3: System.out.print("tiga");break;
		case 4: System.out.print("empat");break;
		default : System.out.print("Angka yang dimasukkan harus 1 s/d 4");break;
		}

	}

}