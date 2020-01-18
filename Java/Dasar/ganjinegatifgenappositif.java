import java.util.*;
public class ganjinegatifgenappositif {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n;
		System.out.print("Masukan batas bilangan: ");
		n = in.nextInt();
		for (int i=1; i<=n ;i++ ) {
			if (i%2==0) {
				System.out.printf("%d " ,i);
			}else{
				System.out.printf("-%d " ,i);
			}
		}
	}
}