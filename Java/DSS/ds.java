import java.util.*;
public class dss {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);

		char opsi;
		do
		{
			char A, b, c, d, e, f;
			System.out.println("\n============================DSS-1187050030===============================");
			System.out.println("==================DIAGNOSA JENIS JERAWAT YANG DIDERITA===================");
			System.out.println("=============================Fathima Umar================================");

			System.out.println("\nPETUNJUK: \na. Program ini dibuat untuk mengetahui kondisi kulit anda. \n2. Anda harus mengisi setiap soal dengan pilihan yang sudah tersedia. \n3. Isi sampai selesai." );
			System.out.println("\n--------------------------------START------------------------------------\n");
			
			//pertanyaan
			System.out.println("Apakah tipe kulit anda berminyak? ");
			System.out.println(" a. ya\n 2. kombinasi\n 3. tidak sama sekali");
			System.out.print(" => ");
			A = in.next().charAt(0);
			System.out.println("-------------------------------------------------------------------------");

			if(A=='1'){
				System.out.println("Seberapa banyak minyak anda?");
				System.out.println(" a. lumayan\n 2. banyak\n 3. tidak terhingga, seperti tambang minyak");
				System.out.print(" => ");
				b = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");
				System.out.println("Seberapa sering anda berjerawat?");
				System.out.println(" a. Sering\n 2. suka\n 3. cuman pas mejelang menstruasi");
				System.out.print(" => ");
				c = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");

			}else if(a=='2'){
				System.out.println("Seberapa sering anda berjerawat? ");
				System.out.println(" a. Sering\n 2. suka\n 3. cuman pas mejelang menstruasi");
				System.out.print(" => ");
				b = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");
			}else if(a=='3'){
				System.out.println("Tapi suka berjerawat ga? :(");
				System.out.println(" a. suka\n 2. ga ");
				System.out.print(" => ");
				b = in.next().charAt(0);
				System.out.println("-------------------------------------------------------------------------");
			}else{
				System.out.println("input yang bener dong sist:(");
			}
			
			//akses keluar dari sistem
			System.out.print("\n\nApakah Anda Ingin Keluar ? ");
			System.out.print("\nKetik y atau n: ");
			opsi = in.next().charAt(0);
		
		}while(opsi == 'n' || opsi == 'N');
	}
}	