import java.util.*;
public class mudikeuy {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double totwak, jartot, gg1, gg2, gg3, jar1, jar2, jar3, kec1, kec2, kec3;

		System.out.print("Total jarak (dalam satuan Km): ");
		jartot = in.nextInt();
		System.out.print("Gigi yang digunakan: ");
		gg1 = in.nextInt();
		if(gg1==1){
			kec1=40;
		}else if(gg1==2){
			kec1=60;
		}else if(gg1==3){
			kec1=80;
		}else if(gg1==4){
			kec1=100;
		}

		System.out.print("Jarak yang sudah ditempuh sampai tempat istirahat: ");
		jar1 = in.nextInt();

		System.out.print("Gigi yang digunakan: ");
		gg2 = in.nextInt();
		if(gg2==1){
			kec2=40;
		}else if(gg2==2){
			kec2=60;
		}else if(gg2==3){
			kec2=80;
		}else if(gg2==4){
			kec2=100;
		}

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
	
		System.out.println("\nWaktu yang diperlukan: " + totwak + " jam.");

	}
}