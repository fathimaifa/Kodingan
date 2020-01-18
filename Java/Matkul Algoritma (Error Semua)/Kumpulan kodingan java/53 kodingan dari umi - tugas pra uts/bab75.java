import java.util.*;
public class bab75 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		char num;
		System.out.println("konversi digit ke integer.");
		System.out.println("------------------");
		
		System.out.print("masukan karakter : ");
		num = in.next().charAt(0);
		
		if(atoi(num)){
			int hasil = atoi(num);
			System.out.print("anda memasukan angka : " + hasil);
		}else{
			System.out.print("anda menginput angka : " + -1);
		}
	}
}