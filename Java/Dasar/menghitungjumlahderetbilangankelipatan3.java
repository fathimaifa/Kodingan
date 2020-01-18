import java.util.*;
public class menghitungjumlahderetbilangankelipatan3 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		int n, total=0;
		System.out.println("MENGHITUNG JUMLAH DERET BILANGAN KELIPATAN 3 DARI 1 SAMPAI n BILANGAN");
		System.out.print("Masukan n bilangan: ");
		n = in.nextInt();

		for(int i=1; i<=n; i+=3){
			total = total + i;
			if(i<n){
				System.out.print(i + "+");
			}else{
				System.out.print(i);
			}
		}
		System.out.println(" = " + total);
	}
}