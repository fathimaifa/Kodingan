import java.util.Scanner;

public class hitungdurasicase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jam1,menit1,detik1,jam2,menit2,detik2;
		System.out.println("jam awal percakapan");
		System.out.print("jam :");
		jam1 = scan.nextInt();
		System.out.print("Menit: ");
		menit1 = scan.nextInt();
		System.out.print("Detik: ");
		detik1 = scan.nextInt();
		
		System.out.println("jam akhir percakapan");
		System.out.print("jam :");
		jam2 = scan.nextInt();
		System.out.print("Menit: ");
		menit2 = scan.nextInt();
		System.out.print("Detik: ");
		detik2 = scan.nextInt();
		
		if(detik2>detik1)
			detik2-=detik1;
		else{
			detik2=(detik2+60)-detik1;
			menit2-=1;
		}
		if(menit2>menit1)
			menit2-=menit1;
		else{
			menit2=(menit2+60)-menit1;
			jam2-=1;
		}
		if(jam2>jam1)
			jam2-=jam1;
		else
			jam2=(jam2+24)-jam1;
		
		System.out.println("Durasi: "+jam2+" jam "+menit2+" menit "+detik2+" detik");
			

	}

}









