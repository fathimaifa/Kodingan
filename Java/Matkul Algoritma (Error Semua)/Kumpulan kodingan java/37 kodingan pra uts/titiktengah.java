import java.util.Scanner;
public class titiktengah{
      public static void main(String[]args){
	      Scanner in = new Scanner (System.in);
		  System.out.print("masukkan sisi 1 : ");
		  int a = in.nextInt ();
		  System.out.print("masukkan sisi 2 : ");
		  int b = in.nextInt();
		  int total = (int) (a*0.5*b*0.5);
		  System.out.print ("titik tengah adalah : " + total);
	  }
}