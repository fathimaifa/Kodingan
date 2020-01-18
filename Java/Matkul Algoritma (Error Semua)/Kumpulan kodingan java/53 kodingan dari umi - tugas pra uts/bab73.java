import java.util.*;
public class bab73{
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		int bilangan1, bilangan2, bilangan3;
		System.out.println("PROGRAM PENGURUT BILANGAN BULAT");
		System.out.println("----------------------");
		System.out.println("masukan bilangan 1 : ");
		bilangan1 = in.nextInt();
		
		System.out.print("masukan bilangan 2 : ");
		bilangan2 = in.nextInt();
		
		System.out.print("masukan bilangan 3 : ");
		bilangan3 = in.nextInt();
		
		if (bilangan1>bilangan2){
			if ((bilangan1>bilangan3)&&(bilangan2>bilangan3)){
				System.out.print(bilangan3 + " ");
				System.out.print(bilangan2 + " ");
				System.out.print(bilangan1 + " ");	
			}else if ((bilangan1>bilangan3)&&(bilangan3>bilangan2)){
				System.out.print(bilangan2 + " ");
				System.out.print(bilangan3 + " ");
				System.out.print(bilangan1 + " ");	
			}

		}else if (bilangan2>bilangan3){
			if ((bilangan2>bilangan1)&&(bilangan1>bilangan3)){
				System.out.print(bilangan3 + " ");
				System.out.print(bilangan1 + " ");
				System.out.print(bilangan2 + " ");	
			}else if ((bilangan2>bilangan1)&&(bilangan3>bilangan1)){
				System.out.print(bilangan1 + " ");
				System.out.print(bilangan3 + " ");
				System.out.print(bilangan2 + " ");	
			}
			
		}else{
			if (bilangan2>bilangan1){
				System.out.print(bilangan1 + " ");
				System.out.print(bilangan2 + " ");
				System.out.print(bilangan3 + " ");
			}else{
				System.out.print(bilangan2 + " ");
				System.out.print(bilangan1 + " ");
				System.out.print(bilangan3 + " ");
			}
		}
	
	}
}