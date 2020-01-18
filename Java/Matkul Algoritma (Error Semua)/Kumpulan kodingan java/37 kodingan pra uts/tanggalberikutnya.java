import java.util.Scanner;

public class tanggalberikutnya{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int hari,bulan,tahun;
		
		System.out.println("masukkan Tanggal, bulan dan Tahun ");
		System.out.print("Tanggal : ");
		hari = scan.nextInt();
		System.out.println("Bulan: ");
		bulan = scan.nextInt();
		System.out.print("Tahun: ");
		tahun = scan.nextInt();
		
		switch(bulan){
		case 4: if(hari<30)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 6: if(hari<30)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 9: if(hari<30)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 11: if(hari<30)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 1: if(hari<31)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 3: if(hari<31)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 5: if(hari<31)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 7: if(hari<31)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 8: if(hari<31)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 10: if(hari<31)
			hari+=1;
				else{
			hari =1;
			bulan+=1;
				}
		break;
		case 2: if(hari<28)
			hari+=1;
		else{
			if(tahun%4==0&&tahun%100!=0 || tahun%400==0){
				if(hari==28)
					hari+=1;
				else{
					hari=1;
					bulan+=1;
				}
			
			}
			else{
				hari=1;
				bulan+=1;
			}
		}
		break;
		case 12: 
			if(hari<31)
				hari+=1;
			else{
				hari=1;
			bulan=1;
			tahun+=1;
			}
		}
		System.out.print("Tanggal besok: Tanggal "+hari+" Bulan "+bulan+" tahun "+tahun);

	}
	
}
