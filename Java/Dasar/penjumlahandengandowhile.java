import java.util.*;
public class penjumlahandengandowhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bil, jum=0;
		char lagi;

		do{
			System.out.print("masukan angka bilangan: ");
			bil = in.nextInt();

			jum=jum+bil;
			System.out.print("Input lagi atau tidak? (y/t): ");
			lagi = in.next().charAt(0);
		}while(lagi=='y'||lagi=='Y');
		System.out.print("jumlahnya adalah = " + jum);
	}
}