import java.util.Scanner;

public class ganjilgenapcase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x;
		System.out.print("Angka: ");
		x = scan.nextInt();
		switch(x%2){
		case 0: System.out.print("genap");
		case 1: System.out.print("Ganjil");
		}
		

	}

}