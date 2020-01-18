public class pertukaran{
	public static void main(String[]args){
		int A = 8;
		int B = 5;

		//output nilai sebelum di swap
		System.out.println("----------------------");
		System.out.println("Sebelum di Swap : ");
		System.out.println("Nilai A : " +A);
		System.out.println("Nilai B : " +B);
		
		//algoritma pertukaran nilai
		System.out.println("----------------------");
		int swap = A;
		A = B;
		B = swap;

		System.out.println("Nilai sesudah ditukar : ");
		System.out.println("Nilai A : " + A);
		System.out.println("Nilai B : " + B);
		System.out.println("---------------------");
	}
}