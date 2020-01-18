import java.util.*;
public class hurufvokal {
	public static void main (String[]args) {
		String cc;
		Scanner in = new Scanner (System.in);

		System.out.print("masukan sebuah huruf : ");
		cc = in.nextInt();

		if((cc='a')||(cc='i')||(cc='u')||(cc='e')||(cc='o')){
			System.out.println("huruf tersebut merupakan huruf vokal");
		}
	}
}