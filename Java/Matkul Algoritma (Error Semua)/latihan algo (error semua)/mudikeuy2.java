import java.util.*;
public class mudikeuy2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double totwak, jartot;
		String[] jar = new String[3];
		String[] kec = new String[3];
		String[] gg = new String[3];


		System.out.print("Total jarak (dalam satuan Km): ");
		jartot = in.nextInt();
		
		System.out.print("Gigi yang digunakan: ");
		gg1 = in.nextInt();
		
		System.out.print("Jarak yang sudah ditempuh sampai tempat istirahat: ");
		jar1 = in.nextInt();

		System.out.print("Gigi yang digunakan: ");
		gg2 = in.nextInt();

		System.out.print("Jarak yang sudah ditempuh sampai tempat istirahat kedua (Km)");
		jar2 = in.nextInt();

		System.out.print("Gigi yang digunakan: ");
		gg3 = in.nextInt();
		if(gg3==1){
			kec3=40;
		}else if(gg3==2){
			kec3=60;
		}else if(gg3==3){
			kec3=80;
		}else if(gg3==4){
			kec3=100;
		}

		jar3 = jartot-(jar1+jar2);
		totwak = (jar1/kec1)+(jar2/kec2)+(jar3/kec3);
		System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");

	}
}