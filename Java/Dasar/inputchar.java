import java.util.*;
public class inputchar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char c;
		do{
			System.out.print("Masukan sebuah karakter: ");
			c = in.next().charAt(0);
			System.out.print("Karakter yang anda masukan: ");
			System.out.println(c);
		}while(c!='x');
	}
}