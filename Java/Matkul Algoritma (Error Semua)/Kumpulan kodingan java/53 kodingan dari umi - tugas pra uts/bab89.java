import java.util.*;
public class bab89 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int angka;
		
		System.out.print("Masukkan Angka = ");
		angka = in.nextInt();
		
		if(angka%2==0 || angka%3==0)
		{
			if(angka == 2 || angka == 3){
				System.out.print(angka + " Adalah Bilangan Prima.");
			}else{
				System.out.print(angka + " Bukan Bilangan Prima.");
			}
		}else{
			System.out.print(angka + " Adalah Bilangan Prima.");
		}
	}
}