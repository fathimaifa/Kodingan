import java.util.*;
public class bab45 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		int lama, kecepatan, jarak;

		System.out.print("berapa jam mobil tersebut berjalan: ");
		lama = in.nextInt();
		System.out.print("berapa besar kecepatan yang ditempuh mobil tersebut: ");
		kecepatan = in.nextInt();

		jarak = lama*kecepatan;
		System.out.println("maka jarak yang ditempuh mobil tersebut: " + jarak + " Km.");

	}
}