import java.util.*;
public class luaspersegi{
   public static void main(String[]args){
    Scanner in=new Scanner (System.in);
	System.out.print("masukkan panjang: ");
	int panjang=in.nextInt();
	System.out.print("masukkan lebar: ");
    int lebar=in.nextInt();
	
	int luas=(panjang*lebar);
	System.out.print("luas persegi panjang = "+luas);
	}
}
	