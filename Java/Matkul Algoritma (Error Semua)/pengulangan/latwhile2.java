import java.util.*;
public class latwhile2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("masukan banyaknya n: ");
		int n = in.nextInt();

		int a=1;
		double b, jum=0;
		while(a<=n){
			b = Math.pow(a, 2);
			if(a==n){
				System.out.print(a + "^2 = ");
			}else{
				System.out.print(a + "^2 + ");
			}
			a++;
			jum = jum + b;
		}
		System.out.print(jum);
	}
}