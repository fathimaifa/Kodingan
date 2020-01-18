import java.util.Scanner;

public class tanggalberikutnyafebruari {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hari,bulan,tahun;
		
		bulan = 2;
		
		System.out.println("masukkan Tanggal dan Tahun ");
		System.out.print("Tanggal : ");
		hari = scan.nextInt();
		System.out.print("Tahun: ");
		tahun = scan.nextInt();
		
		if(hari<28){
			hari+=1;
		}
		else{
			if(tahun%4==0 && tahun%100!=0 || tahun%400==0){
				if(hari==28)
					hari+=1;
				else
					hari =1;
				bulan +=1;
			}
			else{
				hari=1;
				bulan+=1;
			}
		}
		System.out.print("Tanggal besok: Tanggal"+hari+" Bulan "+bulan+" tahun "+tahun);
	}

}
