import java.util.Scanner;
public class CariNamaMahasiswa {
    String no,nama, n;
    double uts,uas,na;
    Scanner getdata=new Scanner(System.in);
    public void setdata(){
        Scanner kata = new Scanner (System.in);
        System.out.println("Jumlah Mahasiswa Yang Di Inputkan");
        System.out.print("Masukkan Dengan Angka : ");
        int a = kata.nextInt();


        System.out.println(" ");
        for (int i=1; i<=a; i++){
            System.out.print("Masukkan Nama Mahasiswa   : ");
            this.nama=getdata.nextLine();
            System.out.print("Masukkan No Absen         : ");
            this.no=getdata.nextLine();
            System.out.println(" ");
        }
    }
    public String getnpm(){
        return this.no;
    }
    public void tampil(){
        System.out.println("Nama Mahasiswa  : "+this.nama);
        System.out.println("No Absen         : "+this.no);
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner getint=new Scanner(System.in);
        int a,z=0,menu=0,ketemu;
        String no;
        CariNamaMahasiswa[] mhs=new CariNamaMahasiswa[128];
        Scanner getdata=new Scanner(System.in);
        while(menu!=3){
            System.out.println(" ");      
            System.out.print("Menu...\n1. Masukkan Data Mahasiswa\n2. Cari Nama Dengan Absen\n3. Keluar\npilihan : ");
            menu=getint.nextInt();
            if(menu==1){
                z++;
                mhs[z]=new CariNamaMahasiswa();
                mhs[z].setdata();
            }
            else if(menu==2){
                if(z<1){
                    System.out.println("Data Masih Kosong");
                }
                else{
                    System.out.print("Masukkan Absen Yang di Cari : ");
                    no=getdata.nextLine();
                    a=0;
                    ketemu=0;
                    while(a<z){
                        a++;
                        if(no.equals(mhs[a].getnpm())){
                            mhs[a].tampil();
                            ketemu++;
                        }                  
                    }
                    if(ketemu<1)
                        System.out.println("Nama Yang Anda Cari Mungkin Tidak Ada");
                }
            }
            else if(menu==3){
                System.out.println("Keluar...");
            }
            else{
                System.out.println("Masukkan Menu Yang Tersedia");
            }
        }  
    }
}