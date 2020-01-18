import java.util.Scanner;

public class upahkaryawan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String nama;
		int JJK,lembur;
		float upah;
		
		System.out.print("Nama: ");
		nama = scan.next();
		System.out.print("Jumlah Jam Kerja: ");
		JJK = scan.nextInt();
		if(JJK<48)
			upah = JJK*2000;
		else{
			lembur = JJK-48;
		upah = 48*2000+lembur*3000;
		}
		System.out.print("upah untuk karyawan "+nama+" adalah "+upah);
	}

}