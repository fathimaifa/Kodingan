import java.util.*;
public class genapganjil {
	public static void main (String[]args){
		int x;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan sebuah angka : ");
		x = in.nextInt();

		if(x%2==0){
			System.out.println("bilangan genap");
		}else{
			System.out.println("bilangan ganjil");
		}
	}
}