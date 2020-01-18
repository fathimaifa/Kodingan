import java.util.Scanner;

public class simulasimenuprogramcase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nomor;
		System.out.println("Menu");
		System.out.println("1. Baca data");
		System.out.println("2. Cetak data");
		System.out.println("3. Ubah data");
		System.out.println("4. Hapus data");
		System.out.println("5. Keluar program");
		System.out.print("Masukkan pilihan anda(1/2/3/4/5): ");
		nomor = scan.nextInt();
		switch(nomor){
		case 1 :System.out.println("anda memilih nomor 1");break;
		case 2 :System.out.println("anda memilih nomor 2");break;
		case 3 :System.out.println("anda memilih nomor 3");break;
		case 4 :System.out.println("anda memilih nomor 4");break;
		case 5 :System.out.println("anda memilih nomor 5");break;
		default : System.out.println("tidak ada dalam daftar");break;
		}
	}

}