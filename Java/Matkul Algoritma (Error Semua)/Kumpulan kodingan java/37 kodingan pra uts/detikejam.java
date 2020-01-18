import java.util.*;
public class detikejam{
      public static void main(String[]args){
	        Scanner in = new Scanner (System.in);
			int total;
			System.out.print("masukkan detik: ");
			int detik = in.nextInt();
			total = detik / 3600;
			System.out.print("konversi waktu ke jam :" + total + "jam");
			}
		}