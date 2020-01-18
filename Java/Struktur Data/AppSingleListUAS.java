import java.util.Scanner;
import java.util.*;
import java.util.LinkedList;

class Node{
   String data;
   Node next;
   
   public Node(String data){
      this.data = data;
   }
   public void tampil(){
      System.out.print("{"+data+"}");
   }
}

class SingleList{
   Node first;
   
   public SingleList(){
      first=null;
   }
   
   public boolean isEmpty(){
      return(first==null);
   }
   
   public void addFirst(String data){
      Node node = new Node(data);
      node.next = first;
      first = node;
   }
   
   //menambah data dari simpul terakhir
   public void addLast(String data){
      Node node, help;
      node = new Node(data);
      node.next=null;
      
      if(isEmpty()){
         first = node;
         first.next = null;
      }
      else{
         help = first;
         while(help.next!=null){
            help=help.next;
         }
         help.next=node;
      }
   }
   
   //menghapus data dari simpul pertama
   public Node deleteFirst(){
      if(!isEmpty()){
         Node temp = first;
         first = first.next;
         return temp;
      }
      else{
         return null;
      }
   }
   
   //menghapus data dari simpul terakhir
   public Node deleteLast(){
      if(!isEmpty()){
         Node temp,current;
         current=first;
         while(current.next.next != null){
            current=current.next;
         }
         temp=current.next;
         current.next=null;
         return temp;
      }
      else{
         Node temp = first;
         first = null;
         return temp;
      }
   }
   
   //menampilkan isi linked list
   public void tampilkan(){
      Node current = first;
      if(current==null){
         System.out.println("kosong");
      }
      else{
         while(current!=null){
            current.tampil();
            current=current.next;
         }
         System.out.println();
      }
   }
}


public class AppSingleListUAS {
    public static void main (String [] args){
      
      System.out.println("\n ===============================================");
      System.out.println("\n ============Keranjang Belanja Shopee===========");
      System.out.println("\n ===============================================");
      
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
            System.out.println ("1. Masukkan Barang ke Dalam Keranjang Belanja");
            System.out.println ("2. Mengganti Barang Dalam Keranjang Belanja");
            System.out.println ("3. Mengambil Barang Dalam Keranjang Belanja");
            System.out.println ("4. Melihat Kondisi Barang Dalam Keranjang Belanja");
            System.out.println ("5. Melihat Barang Dalam Keranjang Belanja");
            System.out.println ("6. Mencari Barang Dalam Keranjang Belanja");
            System.out.println ("7. Jumlah Belanjaan anda");
            System.out.print("\n pilih menu : ");
            option = in.nextInt();
         
         } while (option < 1 || option > 6);
         
         System.out.println(" _______________________________________________\n");
         
            switch (option)
            {
                  case 1:
                  {
                     System.out.print("Jumlah Barang Yang Akan Dimasukkan Ke Dalam Keranjang : ");
                     int x = in.nextInt();
                     for (int i = 0; i < x; i++) {
                        System.out.print("Masukan Barang Ke Dalam Keranjang Ke-" + (i + 1) + " : ");
                        barang = in.next();
                        keranjang.add(barang);
                     }
                     System.out.println ("Barang Yang Tersedia Di Dalam Keranjang : " + keranjang);
                  }
                     break;
                  
                  case 2:
                  {
                     System.out.println ("Barang Yang Ada Pada Keranjang : " + keranjang);
                     System.out.print ("Barang Apa Yang Ingin Kamu Ganti : ");
                     cari1 = in.next();
                     if(keranjang.contains(cari1)){
                        System.out.println ("Barang Ada Didalam Keranjang");
                        System.out.print (cari1 + " Ada diurutan keberapa dalam keranjang itu? : ");
                        int nom = in.nextInt();
                        int nomt = nom -1;
                        System.out.print ("Ingin Menggantinya Dengan Apa : ");
                        ganti = in.next();
                        keranjang.set(nomt, ganti);
                        System.out.println ("Keseterdiaan Barang Terbaru Yang Ada Dalam Keranjang : "+ keranjang);
                     }else{
                        System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                     }
                  }
                     break;
                  
                  case 3:
                  {
                     System.out.println ("Barang Yang Ada Pada Keranjang : " + keranjang);
                     System.out.print ("Mau Mengambil Barang Apa : ");
                     cari2 = in.next();
                     if(keranjang.contains(cari2)){
                        System.out.println("Barang Tersedia Didalam Keranjang");
                        System.out.print ("Pada Urutan Keberapa : ");
                        int no = in.nextInt();
                        int not = no - 1;
                        System.out.println("Silakan Diambil : "+keranjang.remove(not));
                        System.out.println ("Kesediaan Barang Terbaru Yang Ada Dalam Keranjang : "+ keranjang);
                     }else{
                        System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                     }
                  }
                     break;
                  
                  case 4:
                  {
                     if(keranjang.isEmpty()){
                        System.out.println("Tidak Ada Barang Dalam Keranjang");
                     }else{
                        System.out.println("Ada Barang Dalam Keranjang");
                     }
                  }
                  break;

                  case 5:
                  {
                     System.out.println ("Barang Dalam Keranjang : " + keranjang);
                  }
                     break;
                  case 6 :
                  {
                     //Mengecek Apakah Sebuah Element ada Didalam LingkedList
                     System.out.println ("Barang Yang Tersedia Di Dalam Keranjang : " + keranjang);
                     System.out.print ("Masukkan Barang Yang Ingin Di Cari Dalam Keranjang : ");
                     cari3 = in.next();
                     if(keranjang.contains(cari3)){
                        System.out.println("Barang Tersedia Didalam Keranjang");
                     }else{
                        System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                     }
                     break;
                  }
                  case 7 : 
                  {
                     System.out.println("Jumlah Barang Dalam Keranjang : "+keranjang.size());
                  }
            }
            System.out.println(" _______________________________________________\n");
            System.out.print("Mau pilih menu lain? ('Y' atau 'T')  ");
            jwb = in.next().charAt(0);
            
         } while (jwb == 'y' || jwb == 'Y');
         System.out.println("\nSELAMAT BERBELANJA KEMBALI :)");
    }
}