import java.util.*;
public class bab44 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		double fahrenheit, celcius;
		System.out.print("masukan suhu dalam fahrenheit: ");
		fahrenheit = in.nextInt();

		celcius = 0.555*(fahrenheit-32);
		System.out.println("suhu dalam celcius: " + celcius);
	}
}