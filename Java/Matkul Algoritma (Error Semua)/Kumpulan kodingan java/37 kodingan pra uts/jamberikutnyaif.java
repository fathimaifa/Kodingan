import java.util.Scanner;

public class jamberikutnyaif{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int jam,menit,detik;
		System.out.println("masukkan waktu ");
		System.out.print("Jam: ");
		jam = scan.nextInt();
		System.out.print("Menit: ");
		menit = scan.nextInt();
		System.out.print("Detik: ");
		detik = scan.nextInt();
		
		if(detik+1<60)
			detik+=1;
		else{
			detik =0;
		if(menit+1<60)
			menit+=1;
		else{
			menit=0;
			if(jam+1<24)
				jam+=1;
			else
				jam=0;}
		}
		
		System.out.print("jam yang baru setelah 1 detik adalah "+jam+" jam "+menit+" menit "+detik+" detik");
		
		

		

	}

}