import java.util.*;
public class bab810 {
	public static void main(String[] args){
		Scanner in = new Scanner (System.in);
		int n, total=0;
		
		System.out.print("Masukkan Jumlah Bilangan : ");
		n = in.nextInt();
		
		if(n < 0){
			System.out.print("Masukkan Bilangan Positif !");
		}else{
			for(int i=1; i<=n; i++){
				if(i % 2 != 0){
					System.out.println(i);
					total = total + i;
				}
			}
		}
		System.out.print("Total Jumlah Bilangan Ganjil : " + total);
		
	}
}