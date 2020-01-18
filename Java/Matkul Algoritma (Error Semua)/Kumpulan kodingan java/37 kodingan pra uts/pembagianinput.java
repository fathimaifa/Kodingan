import java.util.*;
public class pembagianinput {
	public static void main(String[]args) {
		int bill1;
		int bill2;
		double hasilbagi;

		Scanner in = new Scanner (System.in);
		System.out.print("input bill1: ");
		bill1 = in.nextInt();
		System.out.print("input bill2: ");
		bill2 = in.nextInt();

		//membagi bilangan1 dan bilangan2
		hasilbagi = bill1/bill2;
		if(bill2==0){
			System.out.println("division by zero");
		}else{
			System.out.println("hasil bagi adalah: " +hasilbagi);
		}
	}
}