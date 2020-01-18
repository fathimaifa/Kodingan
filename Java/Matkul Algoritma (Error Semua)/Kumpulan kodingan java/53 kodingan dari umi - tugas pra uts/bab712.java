import java.util.*;
public class bab712 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		int pertamahari, pertamabulan, pertamatahun;
		int keduahari, keduabulan, keduatahun;
		int selisihhari, selisihbulan, selisihtahun;

		System.out.print("Selisih Hari V.2\n");
		System.out.print("Syarat : Tahun Nya Harus Berurutan. Contoh Dari Tanggal 201015 Ke 201018.");
		System.out.print("\n\nMasukkan Tanggal Pertama (dd:mm:yy) \n\n");
		System.out.print("Hari = ");
		pertamahari = in.nextInt();
		System.out.print("Bulan = ");
		pertamabulan = in.nextInt();
		System.out.print("Tahun = ");
		pertamatahun = in.nextInt();
		
		System.out.print("\n\nMasukkan Tanggal Kedua (dd:mm:yy) \n\n");
		System.out.print("Hari = ");
		keduahari = in.nextInt();
		System.out.print("Bulan = ");
		keduabulan = in.nextInt();
		System.out.print("Tahun = ");
		keduatahun = in.nextInt();
		
		int batasbulan=12, awalbulan=pertamabulan, akhirbulan=keduabulan, awaltahun=pertamatahun, akhirtahun=keduatahun, total=0;
		
		if (pertamatahun <= keduatahun) {
			while(pertamatahun <= keduatahun){
				if(pertamabulan == 13){
					pertamabulan = 1;
				}
				
				if (pertamatahun == keduatahun){
					batasbulan = keduabulan;
				}
				
				for(pertamabulan=0; pertamabulan <= batasbulan;pertamabulan++){	
					if (pertamatahun == keduatahun){
						if (pertamabulan == akhirbulan){
							total = total + keduahari;
							System.out.print("\nTotal Selisih Hari = " + total);
						}	
					}
					if(pertamabulan % 2 == 0) {
						if(pertamabulan == awalbulan){
							if(pertamabulan % 2 == 0) {
								if(pertamabulan == 2 && pertamatahun % 4 == 0){
									total = total + (29 - pertamahari);
								}else if(pertamabulan == 2){
									total = total + (28 - pertamahari);
								}else if(pertamabulan == 8){
									total = total + (31 - pertamahari);
								}else{
									total = total + (30 - pertamahari);
								}
							}else{
								total = total + (31 - pertamahari);
							}
						}else if(pertamabulan == 2 && pertamatahun % 4 == 0){
							total = total + 29;
						}else if(pertamabulan == 2){
							total = total + 28;
						}else if(pertamabulan == 8){
							total = total + 31;
						}else{
							total = total + 30;
						}
					}else{
						if(pertamabulan == awalbulan){
							total = total + (31 - pertamahari);
						}else{
							total = total + 31;
						}
					}
					
					if(pertamabulan == 12){
						awalbulan = 0;
					}
				}
				
				pertamatahun++;
			}
		}
		System.out.print("\nTotal Selisih Hari = " + total);
	}
}