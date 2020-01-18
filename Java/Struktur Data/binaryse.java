import java.util.*;
public class binaryse {
	public static int binarySearch(int arr[], int first, int last, int key){
		if (last>=first) {
			int mid = first + (last - first)/2;
			if(arr[mid]==key){
				return mid;
			}
			if (arr[mid]>key){
				return binarySearch(arr, first, mid-1, key);
			} else {
				return binarySearch(arr, mid+1, last, key);
			}
		}
		return - 1; 
	}
	
	public static void main (String args[]){
		Scanner in = new Scanner(System.in);
		int key;
		int kali;

		System.out.print("ingin berapa kali masukan angka? ");
		kali=in.nextInt();
		int arr[] = new int[kali];
		int last = arr.length-1;
		for (int i=0; i<kali; i++) {
			System.out.print("masukan angka: ");
			arr[i]=in.nextInt();
		}
		System.out.println("Bilangan yang dicari? ");
		key = in.nextInt();

		int result = binarySearch(arr, 0, last, key);

		if(result == -1)
			System.out.println("elemen tidak ditemukan!");
		else
			System.out.println("elemen berada pada indeks: " + result);
	}
}