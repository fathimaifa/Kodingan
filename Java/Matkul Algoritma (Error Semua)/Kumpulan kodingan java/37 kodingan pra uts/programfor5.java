import java.util.*;
public class programfor5 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n, total;
		System.out.println("MENGHITUNG JUMLAH BILANGAN GANJIL DARI 1 SAMPAI n BILANGAN");
		System.out.print("Masukan n bilangan: ");
		n = in.nextInt();

		for(int i=1; i<=n; i++){
			total = total + 0;
			total+=2;
		}
		System.out.println("Ada " + total + " bilangan ganjil dalam " + n + " buah bilangan.");
	}
}