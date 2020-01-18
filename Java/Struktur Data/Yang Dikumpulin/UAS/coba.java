import java.util.*;
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

class LinkedList{
   Node first;
   
   public LinkedList(){
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

public class coba{
   public static void main(String[]args){
      TreeSet<String> tset = new TreeSet<String>();
      LinkedList link = new LinkedList();
      
      Scanner in = new Scanner(System.in);
      int n;
      String cari;
      boolean found = false;
      System.out.print("banyak data : ");
         n = in.nextInt();
         
      String nama[] = new String[n];
      
      char jwb;  
      do
      {
         System.out.println(" \nMenu Utama : \n");
         int option;
         do
         {     
            System.out.println ("1. Tambah Barang");
            System.out.println ("2. Hapus Barang");
            System.out.println ("3. Cari Barang");
            System.out.println ("4. Urutan Barang");
            System.out.println ("5. Tampilkan Barang");
            System.out.println ("6. Keluar");
            System.out.print("\n pilih menu : ");
            option = in.nextInt();
         } while (option < 1 || option > 6); 
         System.out.println(" _______________________________________________\n");
            switch (option) {
               case 1:
                  for(int i=0; i<n; i++){
                  System.out.print((i+1)+". ");
                     nama[i]=in.next();
                  link.addFirst(nama[i]);     
                  }
                  for(int i=0; i<n; i++){
                     tset.add(nama[i]);
                  }
                  break;

               case 2:
                  System.out.println("...menghapus barang paling terakhir");
                  link.deleteFirst();
                  System.out.println("Stok barang yang tersisa: ");
                  link.tampilkan();
                  break;

               case 3:
                  System.out.println("nama yang dicari : ");
                  cari = in.next();
                  for(int i=0; i<n; i++){
                     if(nama[i].equals(cari)){
                        found = true;
                        System.out.println("ada");
                     }
                  }
                  if(found==false){
                     System.out.println("tidak ada");
                  }
                  break;

               case 4:
                  System.out.println("barang sebelum diurutkan: ");
                  link.tampilkan();
                  System.out.println("barang sesudah diurutkan");
                  System.out.println(tset);
                  break;

               case 5: 
                  System.out.println("Barang Dalam Keranjang Belanja: ");
                  link.tampilkan();

               case 6:
                  break;
            }
            System.out.println(" _______________________________________________\n");
            System.out.print("Mau pilih menu lain? ('Y' atau 'T')  ");
            jwb = in.next().charAt(0);
            
         } while (jwb == 'y' || jwb == 'Y');
   }
}


