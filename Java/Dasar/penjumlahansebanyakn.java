import java.util.*;
public class penjumlahansebanyakn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int bil, jum=0;
		System.out.print("Masukan banyaknya bilangan: ");
		bil = in.nextInt();

		for(int i=bil; i>=1; i--){
			if (i==1) {
				System.out.printf("%d = " ,i);
			}else{
				System.out.printf("%d+" ,i);
			}
			jum = jum + i;
		}
		System.out.println(jum);
	}
}