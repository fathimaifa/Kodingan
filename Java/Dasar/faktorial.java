import java.util.*;
public class faktorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int jum=1;
		int n;
		System.out.print("Masukan berapa bilangan yang akan di faktorialkan: ");
		n = in.nextInt();
		for(int i=n; i>=1; i--){
			if (i==1) {
				System.out.printf("%d = " ,i);
			}else{
				System.out.printf("%dx" ,i);
			}
			jum = jum * i;
		}
		System.out.println(jum);
	}
}