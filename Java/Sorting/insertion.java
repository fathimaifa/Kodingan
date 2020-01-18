import java.util.*;
public class insertion {
	public static void swap(int[] data, int i, int j){
		int temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}

	public static void Insertion1(int[] data){
		int i, j, temp;
		for (i=1; i<data.length; i++) {
			temp = data[i];
			for(j=i-1; (j>=0)&&(data[j]>temp); j--)
				data[j+1]=data[j];
			data[j+1] = temp;
		}
	}

	public static void Insertion2(int[] data){
		int i, j, temp;
		for (i=1; i<data.length; i++) {
			temp = data[i];
			for(j=i-1; (j>=0)&&(data[j]<temp); j--)
				data[j+1]=data[j];
			data[j+1] = temp;
		}
	}

	public static void main(String[] args){
		int[] data = { 4, 6, 3, 2, 1, 10, 11, 15};

		System.out.print("Nilai sebelum diurutkan: ");
		for(int a: data)
			System.out.print(a+" ");

		Insertion1(data);
		System.out.println();
		System.out.print("Nilai sesudah diurutkan Ascending: ");
		for(int a: data)
			System.out.print(a+" ");

		Insertion2(data);
		System.out.println();
		System.out.print("Nilai sesudah diurutkan Descending: ");
		for(int a: data)
			System.out.print(a+" ");
		System.out.println();
		System.out.println();
	}
}