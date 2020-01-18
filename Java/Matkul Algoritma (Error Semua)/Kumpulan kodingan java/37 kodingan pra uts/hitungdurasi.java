import java.util.*;
public class hitungdurasi{
      public static void main(String[]args){
	        Scanner in = new Scanner (System.in);
			int total;
			int durasi;
			System.out.print("masukkan jam1: ");
			int jam1 = in.nextInt();
			System.out.print("masukkan menit1: ");
			int menit1 = in.nextInt();
			System.out.print("masukkan detik1: ");
			int detik1 = in.nextInt();
			total = (jam1*3600) + (menit1*60) + detik1;
			System.out.println("konversi waktu ke detik1:" + total + " detik1");
			System.out.print("masukkan jam2: ");
			int jam2 = in.nextInt();
			System.out.print("masukkan menit2: ");
			int menit2 = in.nextInt();
			System.out.print("masukkan detik2: ");
			int detik2 = in.nextInt();
			total = (jam2*3600) + (menit2*60) + detik2;
			System.out.println("konversi waktu ke detik2:" + total + " detik2");
			durasi = detik2 - detik1;
			System.out.println("durasi detik :" + durasi + " detik ");
      }
	}