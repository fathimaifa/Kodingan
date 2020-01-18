import java.util.Scanner;

public class tahunkabisat{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int tahun;
		System.out.print("masukkan Tahun: ");
		tahun = scan.nextInt();
		if(tahun%4==0)
			System.out.print("tahun "+tahun+" merupakan tahun kabisat");
		else
			System.out.print("tahun "+tahun+" bukan merupakan tahun kabisat");
	}

}