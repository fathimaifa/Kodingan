import java.util.*;
public class bab72 {
	public static void main (String[] args){
	Scanner in = new Scanner (System.in);
	
	double totja, totbel;
	double diskon;
	System.out.println("PROGRAM PENGHITUNG TOTAL BELANJA DAN DISKON");
	System.out.println("------------------------------");
	
	System.out.print("total uang belanja anda : ");
	totja = in.nextInt();
	
	if (totja>100000){
		System.out.println("Anda mendapatkan diskon sebesar 10%");
		diskon = 0.1*totja;
	}else{
		System.out.println("anda tidak mendapatkan diskon");
		diskon = 0;	
	}	
	totbel = totja - diskon;
	
	System.out.println("besar diskon yang anda dapatkan sebesar : " +diskon);
	System.out.print("total belanja setelah di potong diskon : " +totbel);
	}
}