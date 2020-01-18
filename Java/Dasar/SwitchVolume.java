import java.util.*;
public class SwitchVolume {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		int pil, s, r;
		double l, v;

		System.out.println("Pilihan: \n1. Volume Kubus \n2. Luas Lingkaran \n3. Volume Bola");
		System.out.print("Masukan pilihan anda: ");
		pil = in.nextInt();

		switch (pil){
			case 1:
				System.out.print("Masukan sisi kubus: ");
				s = in.nextInt();
				v = s*s*s;
				System.out.println("Volume kubus = " + v);
				break;
			case 2:
				System.out.print("Masukan jari-jari lingkaran: ");
				r = in.nextInt();
				l = 3.14*r*r;
				System.out.println("Luas lingkaran = " + l);
				break;
			case 3:
				System.out.print("Masukan jari-jari bola: ");
				r = in.nextInt();
				v = 4.18*r*r*r;
				System.out.println("Volume Bola = " + v);
				break;
			default :
				System.out.println("Pilihan hanya tersedia dari nomor 1 sampai 3. \nMasukan pilihan dengan benar!");
		}
	}
}