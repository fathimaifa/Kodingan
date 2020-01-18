import java.util.*;
public class bubble {
	public static void swap(int[] data, int i, int j){
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}

	public static void Bubble1(int[] data) { //ascending
		for(int i=1; i<data.length; i++)
			for(int j=data.length-1; j>=i; j--)
				if(data[j-1]>data[j])
					swap(data, j-1, j);
	}

	public static void Bubble2(int[] data) {
		for (int i=1; i<data.length; i++)
			for (int j=data.length-1; j>=i; j--)
				if(data[j-1]<data[j])
					swap(data, j-1, j);
	}

	public static void main(String[] args) { //descending
		int[] data = { 4, 6, 3, 2, 1, 10, 11, 15};

		System.out.print("Nilai sebelum diurutkan: ");
		for (int a: data)
			System.out.print(a + " ");

		Bubble1(data);
		System.out.println();

		System.out.print("Nilai sesudah diurutkan Ascending: ");
		for(int a: data)
			System.out.print(a + " ");

		Bubble2(data);
		System.out.println();

		System.out.print("Nilai sesudah diurutkan Descending: ");
		for(int a: data)
			System.out.print(a + " ");
		System.out.println();
		System.out.println();
	}
}