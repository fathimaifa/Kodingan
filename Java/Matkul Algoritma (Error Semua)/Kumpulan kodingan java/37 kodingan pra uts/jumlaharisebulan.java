import java.util.Scanner;

public class jumlaharisebulan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int NB,tahun,JH = 0;
		
		System.out.print("masukkan Nomor Bulan: ");
		NB = scan.nextInt();
		System.out.print("masukkan Tahun: ");
		tahun = scan.nextInt();
		switch(NB){
		case 1 : JH = 31;break;
		case 3 : JH = 31;break;
		case 5 : JH = 31;break;
		case 7 : JH = 31;break;
		case 8 : JH = 31;break;
		case 10 : JH = 31;break;
		case 12 : JH = 31;break;
		case 4 : JH = 30;break;
		case 6 : JH = 30;break;
		case 9 : JH = 30;break;
		case 11 : JH = 30;break;
		case 2 : if(tahun%4==0 && tahun%100!=0 || tahun%400==0)
				JH=29;
				else
				JH=28;
		default : System.out.println("Kesalahan dalam memasukkan tahun atau nomor bulan "); 
		}
		
		System.out.print("Jumlah Hari: "+JH);

	}

}
