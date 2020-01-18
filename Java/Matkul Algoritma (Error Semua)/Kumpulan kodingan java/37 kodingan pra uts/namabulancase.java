import java.util.Scanner;

public class namabulancase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int nomor;
		System.out.print("Angka: ");
		nomor = scan.nextInt();
		switch(nomor){
		case 1: System.out.print("Januari");break;
		case 2: System.out.print("Februari");break;
		case 3: System.out.print("Maret");break;
		case 4: System.out.print("April");break;
		case 5: System.out.print("Mei");break;
		case 6: System.out.print("Juni");break;
		case 7: System.out.print("Juli");break;
		case 8: System.out.print("Agustus");break;
		case 9: System.out.print("September");break;
		case 10: System.out.print("Oktober");break;
		case 11: System.out.print("November");break;
		case 12: System.out.print("Desember");break;
		default: System.out.print("bukan bulan yang benar");
		}

	}

}