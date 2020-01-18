import java.util.Scanner;

public class empatpersegipanjangcase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nomor;
		float p,l;
		float luas,k,d;
		System.out.println("Menu Empat Persegi Panjang");
		System.out.println("1. Hitung Luas");
		System.out.println("2. Hitung Keliling");
		System.out.println("3. Hitung Panjang Diagonal");
		System.out.println("4. Keluar Program");
		System.out.print("Masukkan pilihan anda(1/2/3/4): ");
		nomor = scan.nextInt();
		switch(nomor){
		case 1 :System.out.print("panjang: ");
				p = scan.nextFloat();
				System.out.print("lebar: ");
				l = scan.nextFloat();
				luas = p*l;
				System.out.println("Luas = "+luas);
				break;
		case 2 :System.out.print("panjang: ");
				p = scan.nextFloat();
				System.out.print("lebar: ");
				l = scan.nextFloat();
				k = 2*(p+l);
				System.out.println("keliling = "+k);
				break;
		case 3 :System.out.print("panjang: ");
				p = scan.nextFloat();
				System.out.print("lebar: ");
				l = scan.nextFloat();
				d = (float) Math.sqrt(p*p+l*l);
				System.out.println("diagonal = "+d);
				break;
		case 4 :System.out.println("Keluar Program");break;
		default : System.out.println("tidak ada dalam daftar");break;

	}

}
}