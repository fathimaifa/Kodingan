import java.util.Scanner;
public class rataa {
 
    public static void main(String[] args) {
	// write your code here
        //Inisialisasi
        Scanner input = new Scanner(System.in);
        int n, jml, nilai[];
        float rata, jumlah = 0;
 
        //Input jumlah mahasiswa
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        n = input.nextInt();
 
        //Inisialisasi array
        nilai = new int[n];
 
        //Input nilai
        for(int i=0; i<= n-1; i++){
            System.out.print("Nilai Mahasiswa " + (i+1) + " : ");
            nilai[i] = input.nextInt();
            System.out.println();
        }
 
        //Hitung Jumlah
        for(int j=0; j<= n-1; j++){
            jumlah = jumlah + nilai[j];
        }
 
        //Hitung Rata-rata
        rata = jumlah/n;

        System.out.println("Nilai rata-rata : " + rata);
    }
}