import java.util.*;
public class cekprima {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		boolean prima = true;

		System.out.print("\nMasukan sebuah angka: ");
		int angka = in.nextInt();

		for(int pembagi=2; pembagi<=angka/2; pembagi++){
			if(angka%pembagi==0){
				prima=false;
			}else{
				prima=true;
			}
		}
		if(prima){
			System.out.println("Bilangan tersebut prima");
		}else{
			System.out.println("Bilangan tersebut bukan prima");
		}
	}
}