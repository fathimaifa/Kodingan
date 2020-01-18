import java.util.*;
public class maksimum3lain {
	public static void main (String[]args){
		int a, b, c;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan angka pertama: ");
		a = in.nextInt();
		System.out.print("masukan angka kedua: ");
		b= in.nextInt();
		System.out.print("masukan angka ketiga: ");
		c = in.nextInt();

		if(a>b){
			if(a>c){
				System.out.println("bilangan terbesar = " + a);
			}else{
				System.out.println("bilangan terbesar = " + c);
			}
		}else{
			if(b>c){
				System.out.println("bilangan terbesar = " + b);
			}else{
				System.out.println("bilangan terbesar = " + c);
			}
		}
	}
}