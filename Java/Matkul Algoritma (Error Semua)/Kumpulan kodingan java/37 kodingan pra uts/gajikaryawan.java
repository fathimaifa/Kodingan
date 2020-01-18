import java.util.Scanner;
public class gajikaryawan{
     public static void main(String[]args){
	 Scanner scan= new Scanner(System.in);
	 double tunjangan = 0.20;
	 double pajak = 0.15;
	 String nama;
	 double gaji;
	 
	 System.out.print("nama pekerja : ");
	 nama = scan.next();
	 System.out.print("gaji pokok : ");
	 gaji = scan.nextDouble();
	 
	 tunjangan = gaji * tunjangan;
	 pajak = pajak*(gaji+tunjangan);
	 gaji = gaji+tunjangan-pajak;
	 
	 System.out.println("namapekerja: "+nama);
	 System.out.println("gaji bersih: "+gaji);
	 }
	}
	 