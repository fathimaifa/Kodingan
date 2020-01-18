import java.util.*;
public class aritmetikapecahan {
	public static void main (String[]args) {
		int p1a, p1b, p2a, p2b, p3a, p3b;

		Scanner in = new Scanner (System.in);

		System.out.println("--pecahan pertama--");
		System.out.print("masukan pembilang : ");
		p1a = in.nextInt();
		System.out.print("masukan penyebut : ");
		p1b = in.nextInt();

		System.out.println("--pecahan kedua--");
		System.out.print("masukan pembilang : ");
		p2a = in.nextInt();
		System.out.print("masukan penyebut : ");
		p2b = in.nextInt();

		//pertambahan pecahan
		p3a = (p1a*p2b)+(p1b*p2a);
		p3b = p1b*p2b;
		System.out.println("hasil pertambahan = " + p3a + "/" + p3b);

		//pengurangan pecahan
		p3a = (p1a*p2b)-(p1b*p2a);
		p3b = p1b*p2b;
		System.out.println("hasil pertambahan = " + p3a + "/" + p3b);

		//perkalian pecahan
		p3a = p1a*p2a;
		p3b = p1b*p2b;
		System.out.println("hasil pertambahan = " + p3a + "/" + p3b);

		//pembagian pecahan
		p3a = p1a*p2b;
		p3b = p1b*p2a;
		System.out.println("hasil pertambahan = " + p3a + "/" + p3b);
	}
}