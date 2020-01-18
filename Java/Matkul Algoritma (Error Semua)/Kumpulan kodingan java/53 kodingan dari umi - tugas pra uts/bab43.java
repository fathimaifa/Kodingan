import java.util.*;
public class bab43 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		double celcius, fahrenheit;
		System.out.print("masukan suhu dalam celcius: ");
		celcius = in.nextInt();

		fahrenheit = 1.8*celcius+32;

		System.out.println("suhu dalam fahrenheit: " + fahrenheit);

	}
}