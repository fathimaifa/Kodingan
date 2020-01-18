import java.util.Scanner;
public class linear1 {
	public static void LinearSearch(int arr[], int n, int search) {
		int c;
		for (c=0; c<n; c++) {
			if (arr[c]==search) {
				System.out.println(search+" ada di indeks " + c + ".");
				break;
			}
			if (c==n) {
				System.out.println(search + " tidak ada di array.");
			}
		}
	}
	public static void main(String[] args) {
		int c, n, search, array[];

		Scanner in = new Scanner(System.in);
		System.out.print("Masukan nomor elemen ");
		n = in.nextInt();
		array = new int[n];

		System.out.println("Enter those " + n + " elements");

		for (c=0; c<n; c++) {
			array[c] = in.nextInt();
		}
		System.out.println("masukan angka yang akan dicari: ");
		search = in.nextInt();

		linear1.LinearSearch(array, n, search);
	}
}