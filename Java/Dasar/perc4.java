import java.util.*;
public class perc4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String k, ex;
		do{
			int count = 0;
			int spaceCount = 0;
			int charCount = 0;
			System.out.print("masukan kalimat: ");
		k = in.nextLine();
		}while(count != k.length()){
			if(k.charAt(count) == ' ')
				spaceCount++;
			else
				charCount++;
			count++;
		}
		System.out.print("jumlah karakter: ");
		System.out.println(charCount);
		System.out.print("Tekan enter untuk keluar");
		ex = in.nextLine();
	}
}