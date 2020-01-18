import java.util.*;
public class menghitungjumlahbilanganganjilnbilangan {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n, total=0;
		System.out.println("MENGHITUNG JUMLAH BILANGAN GANJIL DARI 1 SAMPAI n BILANGAN");
		System.out.print("Masukan n bilangan: ");
		n = in.nextInt();

		for(int i=1; i<=n; i+=2){
			total = total + 0;
			total++;
		}
		System.out.println("Ada " + total + " bilangan ganjil, dari 1 hingga " + n + ".");
	}
}