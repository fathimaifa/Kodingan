import java.util.*;
public class upahkaryawan1 {
	public static void main (String[]args) {
		String nama;
		int jjk, lembur, upah;
		int jamnormal=48;
		int upahperjam=2000;
		int upahlembur=3000;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan nama anda: ");
		nama = in.nextLine();
		System.out.print("masukan jumlah jam kerja: ");
		jjk = in.nextInt();

		if(jjk<=jamnormal){
			upah = jjk*upahperjam;
		}else{
			lembur = jjk - jamnormal;
			upah = jamnormal*upahnormal+lembur*upahlembur;
		}

		System.out.println("upah total anda adalah: " +upah);
	}
}