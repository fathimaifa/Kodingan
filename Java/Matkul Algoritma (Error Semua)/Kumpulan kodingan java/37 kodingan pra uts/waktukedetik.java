import java.util.*;
public class waktukedetik{
      public static void main(String[]args){
	        Scanner in = new Scanner (System.in);
			int total;
			System.out.print("masukkan jam: ");
			int jam = in.nextInt();
			System.out.print("masukkan menit: ");
			int menit = in.nextInt();
			System.out.print("masukkan detik: ");
			int detik = in.nextInt();
			total = (jam*3600) + (menit*60) + detik;
			System.out.print("konversi waktu ke detik:" + total + " detik");
      }
	}
    		 