import java.util.Scanner;

public class upahkaryawan2{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int JamNormal = 48;
		int UpahPerJam = 2000;
		int UpahLembur = 3000;
		
		
		
		String nama;
		int JJK,lembur;
		float upah;
		
		System.out.print("Nama: ");
		nama = scan.next();
		System.out.print("Jumlah Jam Kerja: ");
		JJK = scan.nextInt();
		if(JJK<JamNormal)
			upah = JJK*UpahPerJam;
		else{
			lembur = JJK-JamNormal;
		upah = JamNormal*UpahPerJam+lembur*UpahLembur;
		}
		System.out.print("upah untuk karyawan "+nama+" adalah "+upah);

	}

}






