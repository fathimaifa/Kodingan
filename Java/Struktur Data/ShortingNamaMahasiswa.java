 import java.util.Scanner;
public class ShortingNamaMahasiswa {
    public static void main(String[] args){
        Scanner kata = new Scanner (System.in);
        int a;
        System.out.println("======================================");
        System.out.println("Pengurutan Nama Mahasiswa Sesuai Abdaj");
        System.out.println("======================================");

        System.out.println("Jumlah Nama Mahasiswa Yang Di Inputkan");
        System.out.print("Masukkan Dengan Angka (0 - 9) : ");
        a = kata.nextInt();

        String[] Array;
        Array = new String[a];
        String temp;
        Scanner input = new Scanner (System.in);
        for(int i=0;i<a;i++){
            System.out.print("Nama Mahasiswa Ke " +(i+1)+" adalah: ");
            Array[i]=input.next(); 
        }

        for(int x=1;x<a;x++){ 
            for(int y=0;y<a-x;y++){
                if(Array[y].compareTo(Array[y+1])>0){
                    temp=Array[y];
                    Array[y]=Array[y+1];
                    Array[y+1]=temp;
                } 
            } 
        }
        System.out.println("");
        System.out.println("Urutannya ");

        for(int i=0;i<a;i++){
            System.out.println((i+1)+". "+ Array[i]);
        }
        
        System.out.println("Jumlah Mahasiswa : " + a);
        System.out.println("Nama Mahasiswa 2 terbawah : " + Array[a-2]);
        System.out.println("Nama Mahasiswa 2 teratas : " + Array[1]);
    }
}