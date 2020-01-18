import java.util.*;
public class bab69 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		int jumpen, kelahiran, migrasi, kematian, emigrasi;
	
		System.out.println("PROGRAM PENGHITUNG JUMLAH PENDUDUK SUATU NEGARA");
		System.out.println("---------------------------------");
		System.out.print("jumlah kelahiran : ");
		kelahiran = in.nextInt();
		
		System.out.print("jumlah migrasi : ");
		migrasi = in.nextInt();
		
		System.out.print("jumlah kematian : ");
		kematian = in.nextInt();
		
		System.out.print("jumlah emigrasi : ");
		emigrasi = in.nextInt();
		
		jumpen = (kelahiran+migrasi)-(kematian+emigrasi);
		
		System.out.print("jumlah penduduk adalah : " + jumpen);
	}
}