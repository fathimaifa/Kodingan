import java.util.*;
public class bab711 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);

		char hp[256], hk[256];
		int pertama, kedua, selisih;
		
		System.out.print("Masukkan Hari Pertama : ");
		hp = in.next().charAt(0);
		
		System.out.print("Masukkan Hari Kedua : ");
		hk = in.next().charAt(0);
		
		//hari pertama
		if (hp == string("senin")) {
			pertama = 1;
		}
		else if(hp == string("selasa")) {
			pertama = 2;
		}		
		else if(hp == string("rabu")) {
			pertama = 3;
		}
		else if(hp == string("kamis")) {
			pertama = 4;
		}
		else if(hp == string("jumat")) {
			pertama = 5;
		}
		else if(hp == string("sabtu")) {
			pertama = 6;
		}
		else if(hp == string("minggu")) {
			pertama = 7;
		}else{
			System.out.print("Masukkan Hari Yang Benar!\n");
		}
		
		//hari kedua
		if (hk == string("senin")) {
			kedua = 1;
		}
		else if(hk == string("selasa")) {
			kedua = 2;
		}		
		else if(hk == string("rabu")) {
			kedua = 3;
		}
		else if(hk == string("kamis")) {
			kedua = 4;
		}
		else if(hk == string("jumat")) {
			kedua = 5;
		}
		else if(hk == string("sabtu")) {
			kedua = 6;
		}
		else if(hk == string("minggu")) {
			kedua = 7;
		}else{
			System.out.print("Masukkan Hari Yang Benar!\n");
		}
		
		//selisih
		selisih = pertama - kedua;
		if (selisih < 0) {
			selisih = selisih * -1;
		}
		System.out.print("Selisih Hari Nya Adalah : " + selisih);
	}
}