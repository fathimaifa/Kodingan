import java.util.*;
public class bab78 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);

		int pixel, convert;
		
		System.out.print("Masukkan Nilai Pixel : ");
		pixel = in.nextInt();
		
		if (pixel > 255) {
			convert = pixel - 255;
			pixel = pixel - convert;
			System.out.println("\nPixel Setelah Clipping : " + pixel);
		}else if(pixel < 0) {
			pixel = pixel * 0;
			System.out.println("\nPixel Setelah Clipping : " + pixel);
		}else if(pixel >= 0 && pixel <= 255) {
			System.out.println("\nPixel Yang Anda Masukkan : " + pixel);
		}
	}
}