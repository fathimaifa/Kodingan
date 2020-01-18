import java.io.IOException;
import java.io.InputStreamReader;

public class hurufvocal{
		public static void main(String[] args) throws IOException {
			InputStreamReader scan = new InputStreamReader(System.in);
			char v;
			System.out.print("Masukkan huruf: ");
			v=(char) scan.read();
			if(v=='a' || v=='i' || v=='u' || v=='e' || v=='o')
				System.out.print("Huruf vokal ");
			else
				System.out.print("bukan huruf vokal");
			
			
			

	}

}
