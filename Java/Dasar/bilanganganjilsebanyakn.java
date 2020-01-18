import java.util.*;
public class bilanganganjilsebanyakn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukan batas bilangan: ");
		int n = in.nextInt();
		for (int i=1; i<=2*n; i++) {
			if(i%2==1){
				System.out.printf("%d " ,i);
			}
		}
	}
}