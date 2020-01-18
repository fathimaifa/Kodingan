import java.util.*;
public class pns{
      public static void main(String[]args){
		  Scanner in = new Scanner (System.in);
		  System.out.print ("gaji pokok :Rp. ");
		  int a = in.nextInt();
		  System.out.print("tunjangan istri : Rp. ");
		  int b = in.nextInt();
		  System.out.print("tunjangan anak : Rp. ");
		  int c = in.nextInt();
		  
		  int total = (int) (a+b+c);
		  System.out.print("total gaji:Rp. " + total);

	  }
}	  
		 