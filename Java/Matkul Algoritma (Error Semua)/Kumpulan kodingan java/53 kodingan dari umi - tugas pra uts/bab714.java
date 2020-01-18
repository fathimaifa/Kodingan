import java.util.*;
public class bab714 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		String asal, tujuan, nama;
		double harga;
		int harilahir, bulanlahir, tahunlahir;
		int hariberangkat, bulanberangkat, tahunberangkat;
		
		System.out.print("Masukkan Kota Keberangkatan : ");
		asal = in.nextLine();
		System.out.print("Masukkan Kota Tujuan : ");
		tujuan = in.nextLine();
		System.out.print("Masukkan Nama Penumpang : ");
		nama = in.nextLine();
		System.out.print("Masukkan Tanggal Lahir = ");
		System.out.print("\nHari (dd) : "); harilahir = in.nextInt();
		System.out.print(" Bulan (mm) : "); bulanlahir = in.nextInt();
		System.out.print(" Tahun (yy) : "); tahunlahir = in.nextInt();
		System.out.print("Masukkan Tanggal Keberangkatan = ");
		System.out.print("\n Hari (dd) : "); hariberangkat = in.nextInt();
		System.out.print(" Bulan (mm) : "); bulanberangkat = in.nextInt();
		System.out.print(" Tahun (yy) : "); tahunberangkat = in.nextInt();
		System.out.print("Masukkan Harga Tiket : "); harga = in.nextInt();
		
		if(tahunberangkat - tahunlahir < 12) {
			System.out.print("\nAnda Mendapatkan Diskon 25% Dari " + harga);
			harga = harga - (harga * 0.25);
			System.out.print("\nMenjadi : " + harga);
		}else{
			System.out.println("\nAnda Tidak Mendapatkan Diskon");
			System.out.print("\nTotal Bayar : " + harga);
		}
	}
}