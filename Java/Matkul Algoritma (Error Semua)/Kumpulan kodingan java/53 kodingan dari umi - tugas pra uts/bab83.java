import java.util.*;

public class bab83 {
	public static void main(String[] args) {
		int n, total=0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Masukkan Jumlah Bilangan : ");
		n = in.nextInt();
		
		if(n < 0){
			System.out.print("Masukkan Bilangan Positif !");
		}else{
			for(int i=1; i<=n; i++){
				if(i % 2 != 0){
				
					total = total + 1;
				}
			}
		}
		System.out.print("Bilangan Ganjilnya Ada : " +total);
	}
}