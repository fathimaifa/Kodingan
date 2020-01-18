import java.util.*;
public class bab81 {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);

		char huruf;
		int jumlah=0;
		
		int pilihan;
		
		System.out.println("Pilih 1. Jumlah Karakter Diketahui");
		System.out.println("Pilih 2. Jumlah Karakter");
		pilihan = in.nextInt();
		switch(pilihan)
		{
			case 1:
				int batas;
				System.out.print("Masukkan Jumlah Karakter Yang Akan Diinput : ");
				batas = in.nextInt();
				
				for(int i=0;i<batas;i++){
					System.out.print("Masukkan Huruf : ");
					huruf = in.next().charAt(0);
					jumlah++;
				}
				break;
			case 2:
				System.out.print("Masukkan Huruf : ");
				huruf = in.next().charAt(0);
				
				while(huruf != '.'){
					System.out.print("Masukkan Huruf : ");
					huruf = in.next().charAt(0);
					jumlah++;
				}
				break;	
		}
		
		System.out.println("\nJumlah Karakter Nya Adalah = " + jumlah);
	
	}
}