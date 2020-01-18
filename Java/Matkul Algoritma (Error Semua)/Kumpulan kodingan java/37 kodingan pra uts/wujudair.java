import java.util.Scanner;

public class wujudair {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float T;
		System.out.print("masukkan suhu: ");
		T = scan.nextFloat();
		if(T<=0)
			System.out.print("Padat");
		else if(T>0 && T<100)
			System.out.print("Cair");
		else if(T>=100)
			System.out.print("Gas/Uap");
		

	}

}