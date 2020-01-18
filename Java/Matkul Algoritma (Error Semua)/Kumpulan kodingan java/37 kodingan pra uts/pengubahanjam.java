import java.util.*;
public class pengubahanjam{
      public static void main(String[]args){
	        Scanner in = new Scanner (System.in);
			int total;
			int totalmenit;
			System.out.print("masukkan jam: ");
			int jam = in.nextInt();
			System.out.print("masukkan menit: ");
			int menit = in.nextInt();
			System.out.print("masukkan detik: ");
			int detik = in.nextInt();
			total = (jam*3600) + menit + (detik*60);
			System.out.println("konversi waktu ke menit:" + total + " menit");
			totalmenit = (total + 1);
			System.out.println("jam berikutnya adalah : " +totalmenit + "menit");
      }
	}
    		 