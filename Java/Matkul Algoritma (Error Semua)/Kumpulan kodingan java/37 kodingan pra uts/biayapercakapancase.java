import java.util.Scanner;

public class biayapercakapancase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jam1,menit1,detik1,jam2,menit2,detik2,durasi,d1,d2;
		float PulsWil = 0,TarifWil = 0,biaya,pulsa;
		String KodeWil;
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
		
		d1 = jam1*3600+menit1*60+detik1;
		d2 = jam2*3600+menit2*60+detik2;
		
		durasi = d2 - d1;
		
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
		
		System.out.println("Kode Wilayah: ");
		KodeWil = scan.next();
		switch(KodeWil){
		case "021" : PulsWil = 60;
					TarifWil = 150;break;
		case "0751" : PulsWil = 30;
					TarifWil = 250;break;
		case "0737" : PulsWil = 25;
					TarifWil = 375;break;
		case "0912" : PulsWil = 20;
					TarifWil = 415;break;
		case "0981" : PulsWil = 7;
					TarifWil = 510;break;
		default: 	System.out.println("Kode Wilayah Tidak terdaftar");break;
		
		}
	
		pulsa = durasi/PulsWil;
		biaya = pulsa*TarifWil;
		
		
		
		
		System.out.println("Durasi: "+jam2+" jam "+menit2+" menit "+detik2+" detik, total durasi dalam detik "+durasi+" detik dan biaya "+biaya);
			

	}

}
