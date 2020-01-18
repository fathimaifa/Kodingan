import java.util.Scanner;
import java.util.*;
import java.util.LinkedList;

class Node {
    
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }

    public void tampil(){
        System.out.print("{"+data+"}");
    }
}

class singleList {

    Node first ;

    public singleList(){
        first = null;
    }

    public boolean isEmpty(){
        return (first==null);
    }

    public void addLast(int data){
        Node node, help;
        node = new Node(data);
        node.next = null;

        if(isEmpty()){
            first = node;
            first.next = null;
        }else{
            help = first;
            while(help.next!=null){
                help=help.next;
            }
            help.next=node;
        }
    }

    public Node deleteFirst(){
        if(!isEmpty()){
            Node temp = first;
            first = first.next;
            return temp;
        }else{
            return null;
        }
    }


    public Node delete(){
        if(!isEmpty()){
            Node temp, current;
            current=first;
            while(current.next.next != null){
                current=current.next;
            }
            temp=current.next;
            current.next=null;
            return temp;
        }else{
            Node temp = first;
            first = null;
            return temp;
        }
    }

    public void tampilkan(){
        Node current = first;
        if(current == null){
            System.out.println("Kosong!");
        }else{
            while(current != null){
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
}


public class UasA {
    public static void main (String [] args){
      
      System.out.println("\n =====================<><><>====================");
      System.out.println("\n =========<> Keranjang Belanja Shopee <>========");
      System.out.println("\n ==============<> Fathima Umar <>===============");
      
      String barang, cari, ganti, cari1,cari2,cari3;
      LinkedList<String> keranjang = new LinkedList<>();
      Scanner in = new Scanner (System.in);
      
      char jwb;
      
      do
      {
         System.out.println(" \nMenu Utama : \n");
         int option;
         do
         {     
            System.out.println ("1. Tambah Barang ke Dalam Keranjang Belanja");
            System.out.println ("2. Mengganti Barang Dalam Keranjang Belanja");
            System.out.println ("3. Menghapus Barang Dalam Keranjang Belanja");
            System.out.println ("4. Mengecek Apakah Keranjang Belanja Kosong");
            System.out.println ("5. Mengurutkan Barang Dalam Keranjang Belanja");
            System.out.println ("6. Mencari Barang Dalam Keranjang Belanja Anda");
            System.out.println ("7. Jumlah Barang Dalam Keranjang Belanja Anda");
            System.out.println ("8. Menampilkan Barang Pada Keranjang Belanja");
            System.out.println ("9. Keluar");
            System.out.print("\n pilih menu : ");
            option = in.nextInt();
         } while (option < 1 || option > 9);
         
         System.out.println(" _______________________________________________\n");
         
            switch (option)
            {
                  case 1:
                     System.out.print("Jumlah Barang Yang Akan Dimasukkan Ke Dalam Keranjang : ");
                     int x = in.nextInt();
                     for (int i = 0; i < x; i++) {
                        System.out.print("Masukan Barang Ke Dalam Keranjang Ke-" + (i + 1) + " : ");
                        barang = in.next();
                        keranjang.add(barang);
                     }
                     System.out.println ("Barang Yang Tersedia Di Dalam Keranjang : " + keranjang);
                     break;
                  
                  case 2:
                     System.out.println ("Barang Yang Ada Pada Keranjang : " + keranjang);
                     System.out.print ("Barang Apa Yang Ingin Kamu Ganti : ");
                     cari1 = in.next();
                     if(keranjang.contains(cari1)){
                        System.out.print ("Barang tersebut ada diurutan keberapa dalam keranjang itu? : ");
                        int nom = in.nextInt();
                        int nomt = nom -1;
                        System.out.print ("Ingin Menggantinya Dengan Apa : ");
                        ganti = in.next();
                        keranjang.set(nomt, ganti);
                        System.out.println ("Keseterdiaan Barang Terbaru Yang Ada Dalam Keranjang : "+ keranjang);
                     }else
                        System.out.println("Barang Tidak Ada Dalam Keranjang");
                     break;
                  
                  case 3:
                     System.out.println ("Barang Yang Ada Pada Keranjang : " + keranjang);
                     System.out.print ("Mau Menghapus Barang Apa : ");
                     cari2 = in.next();
                     if(keranjang.contains(cari2)){
                        System.out.print ("Barang tersebut ada diurutan keberapa dalam keranjang itu? : ");
                        int no = in.nextInt();
                        int not = no - 1;
                        System.out.println("Silakan Diambil : "+keranjang.remove(not));
                        System.out.println ("Kesediaan Barang Terbaru Yang Ada Dalam Keranjang : "+ keranjang);
                     }else
                        System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                     break;
                  
                  case 4:
                     if(keranjang.isEmpty())
                        System.out.println("Tidak Ada Barang Dalam Keranjang");
                     else
                        System.out.println("Keranjang Belanja Anda Tidak Kosong");
                     break;

                  case 5:
                     System.out.println ("Barang dari yang paling awal ditambahkan hingga yang paling akhir ditambahkan : " + keranjang);
                     break;

                  case 6 :
                     System.out.print ("Masukkan Barang Yang Ingin Di Cari Dalam Keranjang : ");
                     cari3 = in.next();
                     if(keranjang.contains(cari3))
                        System.out.println("Barang Tersedia Didalam Keranjang");
                     else
                        System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                     break;
                  
                  case 7 : 
                     System.out.println("Jumlah Barang Dalam Keranjang : "+keranjang.size());
                     break;

                  case 8 :
                     System.out.println ("Barang yang ada didalam keranjang belanja anda : " + keranjang);
                     break;

                  case 9 : 
                      break;

            }
            System.out.println(" _______________________________________________\n");
            System.out.print("Mau pilih menu lain? ('Y' atau 'T')  ");
            jwb = in.next().charAt(0);
            
         } while (jwb == 'y' || jwb == 'Y');
         System.out.println("\nSELAMAT BERBELANJA KEMBALI :)");
    }
}