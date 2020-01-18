import java.util.*;
public class bab63 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		int pertamahari, pertamabulan, pertamatahun;
		int keduahari, keduabulan, keduatahun;
		int selisihhari, selisihbulan, selisihtahun;
		
		System.out.print("masukan tanggal pertama(dd:mm:yy)\n");
		System.out.print("hari = ");
		pertamahari = in.nextInt();
		
		System.out.print("bulan = ");
		pertamabulan = in.nextInt();
		
		System.out.print("tahun = ");
		pertamatahun = in.nextInt();
	
		System.out.println("...");
		
		System.out.print("\nMasukan tanggal kedua (dd:mm:yy) \n");
		System.out.print("hari = ");
		keduahari = in.nextInt();
		
		System.out.print("bulan = ");
		keduabulan = in.nextInt();
			
		System.out.print("tahun = ");
		keduatahun = in.nextInt();
		
		selisihtahun = pertamatahun - keduatahun;
		selisihbulan = pertamabulan - keduabulan;
		selisihhari = pertamahari - keduahari;
		
		if(selisihtahun<0){
				selisihtahun = selisihtahun*-1;
		}
		else if(selisihbulan<0){
			selisihbulan = selisihbulan*1;
		}
		else if(selisihhari<0){
			selisihhari = selisihhari*-1;
		}
		System.out.print("\nSelisih = " + selisihtahun + " tahun " + selisihbulan + " bulan " + selisihhari + " hari ");
	}
}