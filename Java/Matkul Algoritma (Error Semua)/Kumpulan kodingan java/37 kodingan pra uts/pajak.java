import java.util.Scanner;
public class pajak{
     public static void main(String [] args){
	     Scanner scan=new Scanner (System.in);
		 
		 System.out.print("total belanja: ");
		 double harga = scan.nextDouble();
		 System.out.print("diskon(%) : ");
		 float diskon=scan.nextFloat();
		 double total=(double)((double) harga-(harga*diskon/100));
		 System.out.print("harga yang harus dibayar: "+total);
	 }
}
		 
		