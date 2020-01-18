import java.util.Scanner;

public class akarpersamaankuadratS  {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a,b,c,D,x1 = 0,x2 = 0;
		
		System.out.println("masukkan koefesien kuadrat: ");
		System.out.print("a: ");
		a = scan.nextFloat();
		System.out.print("b: ");
		b = scan.nextFloat();
		System.out.print("c: ");
		c = scan.nextFloat();
		
		D = b*b-4*a*c;
		
		if(D<0)
			System.out.println("Akar-akar persamaan kuadrat imaginer ");
		else if(D>0){
			x1 = (float) ((-b+Math.sqrt(D))/(2*a));
			x1=(float) ((-b-Math.sqrt(D))/2*a);
		}
		else{
			x1 = (float) ((-b+Math.sqrt(D))/(2*a));
			x2=x1;
		}
		System.out.println("Akar-akar persamaan kuadrat : "+x1+","+x2);
	}

}
