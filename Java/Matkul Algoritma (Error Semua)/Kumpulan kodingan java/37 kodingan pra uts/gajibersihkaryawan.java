import java.util.Scanner;
public class gajibersihkaryawan {
	public static void main(String[]args) {
		int tunjangan;
		int pajak;
		double gajibersih;
		int gajipokok;
		String nama;

		Scanner scan = new Scanner(System.in);
		System.out.println("Menghitung Gaji Bersih Karyawan Setelah dipotong pajak 15% dan ditambah tunjangan 20%");
		
		System.out.print("Masukan nama Anda : ");
		nama = scan.nextLine();
		System.out.print("Besar Gaji Pokok Anda: ");
		gajipokok = scan.nextInt();

		//menghitung gaji bersih
		gajibersih = gajipokok - (gajipokok*0.15) + (gajipokok*0.2);

		System.out.println("Gaji bersih anda adalah : " +gajibersih);



	}
}