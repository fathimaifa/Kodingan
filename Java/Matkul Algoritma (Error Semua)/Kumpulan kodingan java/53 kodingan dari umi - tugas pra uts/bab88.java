import java.util.*;
public class bab88 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int pil;
		float total=0;
			System.out.print("Pilih = \n0. Transfer\n1. Tarik\n2. Keluar\n");
			pil = in.nextInt();
			
			switch(pil){
				case 0:
					float transfer;
					System.out.print("Masukkan Uang Untuk Transfer = ");
					transfer = in.nextInt();
					
					total = total + transfer;
					
					System.out.print("\nSukses Transfer Senilai = " +transfer);
					System.out.print("\nSaldo Anda = " +total);
					break;
					
				case 1:
					float tarik;
					System.out.print("Masukkan Jumlah Uang Untuk Diambil = ");
					tarik = in.nextFloat();
					
					if(total > 10000){
						total = total - tarik;	
						System.out.print("\nAnda Berhasil Menarik Uang = " +tarik);
						System.out.print("\nSaldo Anda = " +total);
					}else{
						System.out.print("\nSaldo Anda = " +total);
						System.out.print("\nTotal Saldo Dibawah 10000, Anda Tidak Bisa Menarik Saldo Tersebut.");
					}
					break;
				}
	}
}