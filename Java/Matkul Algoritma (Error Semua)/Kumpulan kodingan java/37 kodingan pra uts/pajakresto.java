import java.util.Scanner;
public class pajakresto {
	public static void main(String[]args){
		int bayar;
		int pajak;
		double tot;
		double total;

		Scanner scan = new Scanner(System.in);
		System.out.println("Menghitung Total Belanja Dengan Pajak 10%");
		System.out.print("Total Belanja Anda: ");
		bayar = scan.nextInt();

		//menghitung total belanja setelah di diskon
		tot = 0.1 * bayar;
		total = tot + bayar;

		System.out.print("total yang harus anda bayar : " +total);
	}
}