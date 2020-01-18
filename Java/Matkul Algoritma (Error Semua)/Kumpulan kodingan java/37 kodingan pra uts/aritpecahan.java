import java.util.*;
public class aritpecahan{
     public static void main(String[]args){
	     int p1a,p1b,p2a,p2b,pa,pb;
		 Scanner scan = new Scanner (System.in);
		 
		 System.out.println("pecahan pertama(a/b) ");
		 System.out.print("a: ");
		 p1a=scan.nextInt();
		 System.out.print("b: ");
		 p1b=scan.nextInt();
		 
		 System.out.println("pecahan kedua(a/b) ");
		 System.out.print("a: ");
		 p2a=scan.nextInt();
		 System.out.print("b: ");
		 p2b=scan.nextInt();
		 
		 //penjumlahan 
		 pa=p1a*p2b+p2a*p1b;
		 pb=p1b*p2b;
		 System.out.println("hasilpenjumlahan= "+pa+"/"+pb);
		 
		 //pengurangan
		 pa=p1a*p2b-p2a*p1b;
		 pb=p1b*p2b;
		 System.out.println("hasilpengurangan= "+pa+"/"+pb);
		 
		 //perkalian
		 pa=p1a*p2a;
		 pb=p1b*p2b;
		 System.out.println("hasilperkalian= "+pa+"/"+pb);
		 
		 //pembagian
		 pa=p1a*p2a;
		 pb=p1b*p2b;
		 System.out.println("hasilpembagian= "+pa+"/"+pb);
	 }
}
		 
		 
		 
		 
		 
		 