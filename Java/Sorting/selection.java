import java.util.*;
public class selection {
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

	public static void Selection2(int[] data){
		int i, j, imak;
		for(i=data.length-1; i>0; i--){
			imak = i;
			for(j=i-1; j>=0; j--)
				if(data[j]<data[imak])
					imak=j;
			swap(data, i, imak);
		}
	}

	public static void main(String[] args){
		int[] data = { 4, 6, 3, 2, 1, 10, 11, 15};

		System.out.print("Nilai sebelum diurutkan: ");
		for(int a: data)
			System.out.print(a+" ");

		Selection1(data);
		System.out.println();
		System.out.print("Nilai sesudah diurutkan Ascending: ");
		for(int a: data)
			System.out.print(a+" ");

		Selection2(data);
		System.out.println();
		System.out.print("Nilai sesudah diurutkan Descending: ");
		for(int a: data)
			System.out.print(a+" ");
		System.out.println();
		System.out.println();
	}
}