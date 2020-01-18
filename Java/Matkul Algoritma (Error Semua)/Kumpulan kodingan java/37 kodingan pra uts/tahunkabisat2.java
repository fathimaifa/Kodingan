import java.util.Scanner;

public class tahunkabisat2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tahun;
		System.out.print("masukkan Tahun: ");
		tahun = scan.nextInt();
		if(tahun%4==0 && tahun%100!=0 || tahun%400==0)
			System.out.print("tahun "+tahun+" merupakan tahun kabisat");
		else
			System.out.print("tahun "+tahun+" bukan merupakan tahun kabisat");

	}

}