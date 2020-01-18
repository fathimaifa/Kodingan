import java.util.*;
public class cekinputprima {
	public static void main(String[]args) {
		boolean prima = true;
		Scanner in = new Scanner (System.in);
		System.out.print ("masukan sebuah angka:");
		int angka = in.nextInt();
		for (int pembagi=2; pembagi<=angka/2; pembagi++ ) {
			if(angka%pembagi==0){
				prima=false;
			}else{
				prima=true;
			}
		}

		if(prima){
			System.out.println("bilangan tersebut prima");
		}else{
			System.out.println("bilangan tersebut bukan prima");
		}
	}
}