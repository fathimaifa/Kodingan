import java.util.*;
public class jamberikutnya2 {
	public static void main (String[]args) {
		int hh, mm, ss, mm1, ss1, hh1;

		Scanner in = new Scanner (System.in);
		System.out.print("masukan jam: ");
		hh = in.nextInt();
		System.out.print("masukan menit: ");
		mm = in.nextInt();
		System.out.print("masukan detik: ");
		ss = in.nextInt();

		ss1= ss+1;
		mm1= mm+1;
		hh1= hh+1;
		if(ss1<60){
			ss = ss + 1;
		}else if(ss1==60){
			ss = 0;
		}

		if(mm1<60){
			mm = mm + 1;
		}else if(mm1==60){
			if(hh1<24){
				hh = hh + 1;
			}else{
				hh = 0;
			}
		}

		System.out.println(hh + ":" + mm + ":" + ss);
	}
}


