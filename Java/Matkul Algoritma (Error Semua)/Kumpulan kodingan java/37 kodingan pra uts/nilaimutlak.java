import java.util.Scanner;

public class nilaimutlak{

	public static void main(String[] args) {
		int x;
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan bilangan: ");
		x=scan.nextInt();
		if(x<0){
			x=-x;
			System.out.print("Nilai mutalk = "+x);
		}
		else
		System.out.print("nilai mutlak = "+x);

	}

}
