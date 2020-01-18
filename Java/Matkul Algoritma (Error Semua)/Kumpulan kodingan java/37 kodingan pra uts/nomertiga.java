import java.util.*;
public class nomertiga {
	public static void main (String[]args) {
		double total;
		Scanner in = new Scanner (System.in);

		System.out.print ("masukan total belanja anda:");
		int tot = in.nextInt();

		if(tot<100000){
			System.out.println("Total Pembelian adalah Rp. " +tot + " Anda tidak mendapat diskon");
		}
		else{
			total = tot - (tot*0.05);
			System.out.println("Total Pembelian adalah Rp. " +total);
		}
	}
}