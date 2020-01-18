import java.util.Scanner;

public class upahkaryawancase {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
		
		int JamNormal = 48;
		int UpahLembur = 3000;
		
		
		
		String nama;
		int JJK,lembur,UpahPerJam = 0;
		float upah;
		char gol = 0;
		
		System.out.print("Nama: ");
		nama = scan.next();
		System.out.print("Golongan: ");
		gol = (char) scan.next().charAt(gol);
		System.out.print("Jumlah Jam Kerja: ");
		JJK = scan.nextInt();
		
		switch(gol){
			case 'A' : UpahPerJam = 4000;break;
			case 'B' : UpahPerJam = 5000;break;
			case 'C' : UpahPerJam = 6000;break;
			case 'D' : UpahPerJam = 7500;break;
			default:System.out.println("tidak ada dalam daftar golongan");
		}
		
		if(JJK<JamNormal)
			upah = JJK*UpahPerJam;
		else{
			lembur = JJK-JamNormal;
		upah = JamNormal*UpahPerJam+lembur*UpahLembur;
		}
		System.out.print("upah untuk karyawan "+nama+" adalah "+upah);

	}

}