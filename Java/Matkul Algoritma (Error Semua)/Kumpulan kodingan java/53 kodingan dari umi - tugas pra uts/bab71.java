import java.util.*;
public class bab71{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int a, b;
		System.out.println("PENDETEKSI KELIPATAN 4");
		System.out.println("----------------------");
		System.out.print("masukan sebuah angka : ");
		a = in.nextInt();
		
		b = a % 4;
		
		if(b==0)
			System.out.print(a + " merupakan kelipatan 4");
		else
			System.out.print(a + " bukan merupakan kelipatan 4");
	
	}
}