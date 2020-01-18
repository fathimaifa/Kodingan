import java.util.*;
public class maksimum3lain2 {
	public static void main (String[]args){
		int a, b;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan angka pertama : ");
		a = in.nextInt();
		System.out.print("masukan angka kedua : ");
		b = in.nextInt();

		if(a>b)&&(a>c){
			System.out.println("bilangan terbesar : " + a);
		}else if(b>a)&&(b>c){
			System.out.println("bilangan terbesar : " + b);
		}else{
			System.out.println("bilangan terbesar : " + c);
		}
	}
}