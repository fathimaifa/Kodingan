import java.util.Scanner;

public class kuadrantitik{

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		
		int x,y;
		System.out.println("masukkan titik");
		System.out.print("x: ");
		x = scan.nextInt();
		System.out.print("y: ");
		y = scan.nextInt();
		
		if(x>0 && y>0)
			System.out.print("Kuadran I ");
		else if(x<0 && y>0)
			System.out.print("Kuadran II ");
		else if(x<0 && y<0)
			System.out.print("Kuadran III ");
		else if(x>0 && y<0)
			System.out.print("Kuadran IV ");
		else
				System.out.print("Tidak di Kuadran manapun ");
		

	}

}