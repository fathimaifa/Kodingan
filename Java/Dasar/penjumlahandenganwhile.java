import java.util.*;
public class penjumlahandenganwhile {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bil, jum=0;
		char lagi=' ';

		while(lagi!='t'){
			System.out.print("masukan angka bilangan: ");
			bil = in.nextInt();
			System.out.print("Input lagi atau tidak? (y/t): ");
			lagi = in.next().charAt(0);
			jum=jum+bil;
		}
		System.out.print("jumlahnya adalah = " + jum);
	}
}