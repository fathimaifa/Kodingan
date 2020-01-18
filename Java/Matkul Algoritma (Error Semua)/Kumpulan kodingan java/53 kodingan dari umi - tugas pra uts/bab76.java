import java.util.*;
public class bab76 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		int tot, total, a, b, c, x, y, z;
	
		System.out.print("masukan total belanja : ");
		tot = in.nextInt();
		
		a=100;
		b=50;
		c=25;
		
		x=tot%100;
		y=tot%50;
		z=tot%25;
		
		if((x<100)&&(x>50)){
 			if(x<25){
				total=tot-z;
				System.out.print("total belanja anda : " + total);
			}else{
				total=tot-y;
				System.out.print("total belanja anda : " + total);
			}

		}else if(x<50){
			if(x<25){
				total=tot-z;
				System.out.print("total belanja anda : " + total);
			}else{
				total=tot-y;
				System.out.print("total belanja anda : " + total);
			}
		}
	}
}