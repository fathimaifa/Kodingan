import java.util.Scanner;

public class kodeposcase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String kota;
		System.out.println("Masukkan kota: ");
		kota = scan.next();
		switch(kota){
		case "Padang" : System.out.println("25000");break;
		case "Bandung" : System.out.println("40100");break;
		case "Solo" : System.out.println("51000");break;
		case "Denpasar" : System.out.println("72000");break;
		case "Palu" : System.out.println("92300");break;
		default : System.out.println("tidak ada dalam daftar");break;
		}

	}

}