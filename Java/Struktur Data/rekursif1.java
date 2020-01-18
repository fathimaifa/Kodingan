import java.util.*;
public class rekursif1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Masukan nilai: ");
		int nilai = in.nextInt();

		//fungsi printnilai
		System.out.println("Anda memasukan nilai: ");
		printnilai(nilai);
		System.out.println();

		//fungsi jumlahnilai
		System.out.println("Jumlah nilai: ");
		int jumlah = jumlahnilai(nilai);
		System.out.println("jumlah = " + jumlah);
		System.out.println();

		//fungsi hitungfaktorial
		System.out.println("Faktorial nilai: ");
		int faktorial = hitungfaktorial(nilai);
		System.out.println("faktorial = " + faktorial);
		System.out.println();
	}

	public static void printnilai(int parameter){
		System.out.println("nilai = " + parameter);

		if (parameter == 0){
			return;
		} parameter--;
		printnilai(parameter);
	}

	private static int jumlahnilai(int parameter){
		System.out.println("nilai = " + parameter);
		if (parameter == 0){
			return parameter;
		} return parameter + jumlahnilai(parameter-1);
	}

	private static int hitungfaktorial (int parameter){
		System.out.println("nilai = " + parameter);

		if (parameter == 1){
			return parameter;
		} return parameter*hitungfaktorial(parameter-1);
	}
}