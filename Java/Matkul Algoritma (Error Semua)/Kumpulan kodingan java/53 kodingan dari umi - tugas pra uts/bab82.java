import java.util.*;
public class bab82 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int n, total=0;
		
		System.out.print("Masukkan Jumlah Bilangan : ");
		n = in.nextInt();
		
		if(n < 0){
			System.out.println("Masukkan Bilangan Positif !");
		}else{
			for(int i=1; i<=n; i++){
				if(i % 2 != 0){
					System.out.println(i);
					total = total + i;
				}
			}
		}
		System.out.println("Total Jumlah Bilangan Ganjil : " +total);
	}
}