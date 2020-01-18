import java.util.*;
public class bab84 {
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		int n, i=1, s;
		
		System.out.print("Masukkan Tinggi Bintang : ");
		n = in.nextInt();
		
		while(i<=n){
			for(s=1; s<=i; s++){
				System.out.print("*");
				if(s==i){
					System.out.print("\n");
				}
			}
			i++;
		}
		n=n-1;
		while(n>=1){
			for(s=n; s>=1; s--){
				System.out.print("*");
				if(s==1){
					System.out.print("\n");
				}
			}
		 	n--;
		}
	}
}