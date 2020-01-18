import java.util.Scanner;

public class indeksnilai{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nama;
		float nilai;
		char index;
		
		System.out.print("Nama: ");
		nama=scan.next();
		System.out.print("Nilai: ");
		nilai=scan.nextFloat();
		
		if(nilai>=80)
			index = 'A';
		else if(nilai>=70 && nilai<80)
			index = 'B';
		else if(nilai>=55 && nilai<70)
			index = 'C';
		
		else if(nilai>=40 && nilai<55)
			index = 'D';
		
		else
			index = 'E';
		
		System.out.print("Nama: "+nama+", Nilai: "+nilai+", index: "+index);
		
		
		
		

	}

}