import java.util.*;
public class binarysort {

	public static void swap(int[] data, int i, int j){
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}

	public static void Selection1(int[] data){
		int i, j, imak;
		for (i=data.length-1; i>0; i--) {
			imak = i;
			for(j=i-1; j>=0; j--)
				if(data[j]>data[imak])
					imak=j;
			swap(data, i, imak);
		}
	}

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

		System.out.println("ingin berapa kali masukan angka? ");
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