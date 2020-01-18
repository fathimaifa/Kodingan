class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data){
        this.data = data;
    }

    public void tampil(){
        System.out.print("{"+data+"}");
    }
}

class DoubleLinkedList {
    Node first;
    Node last;

    //kontruktor
    //set nilai awal adalah null
    public DoubleLinkedList() {
        first = null;
        last = null;
    }

    //mengecek apakah linked list kosong atau tidak
    public boolean isEmpty(){
        return (first==null);
    }

    //method untuk menginsert data dari pertama
    public void insertFirst(String data){
        Node node = new Node(data);
        if(isEmpty()){
            last = node;
        }else{
            first.prev = node;
        }

        node.next = first;
        first = node;
    }

    //method untuk menginsert data dari terakhir
    public void insertLast(String data){
        Node node = new Node(data);
        if( isEmpty() )
            first = node;
        else{
            last.next = node;
            node.prev = last;
        }
        last = node;
    }

    //method untuk menginsert data pertama
    public Node deleteFirst(){
        Node temp = first;
        if(first.next == null)
            last = null;
        else
            first.next.prev = null;
        first = first.next;
        return temp;
    }

    //method untuk menghapus data terakhir
    public Node deleteLast(){
        Node temp = last;
        if(first.next == null)
            first = null;
        else
            last.prev.next = null;
        last = last.prev;
        return temp;
    }

    //method untuk menginsert data di tengah
    public boolean insertAfter(int key, String data){
        Node current = first;
        while(current.data != key){
            current = current.next;
            if(current == null)
            return false;
        }
        Node node = new Node(data);

        if(current==last){
            node.next = null;
            last = node;
        }else{
            node.next = current.next;
         
            current.next.prev = node;
        }
        node.prev = current;
        current.next = node;
        return true;
    }

    //method untuk menghapus data yang dipilih
    public Node deleteKey(String key){
        Node current = first;
        while(current.data != key){
            current = current.next;
        if(current == null)
            return null;
        }
        if(current==first)
            first = current.next;
        else
            current.prev.next = current.next;
        if(current==last)
            last = current.prev;
        else
            current.next.prev = current.prev;
            return current;
    }

    //menampilkan data dari pertama - terakhir
    public void displayForward(){
        System.out.print("List (first-->last): ");
        Node current = first;

        while(current != null){
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }

    //menampilkan data dari terakhir - pertama
    public void displayBackward(){
        System.out.print("List (last-->first): ");
        Node current = last;
        while(current != null){
            current.tampil();
            current = current.prev;
        }
        System.out.println("");
    }
}

public class DoubleLinkedListApp {
    public static void main(String[] args){
    	System.out.println("\n ===============================================");
      	System.out.println("\n ============Keranjang Belanja Shopee===========");
      	System.out.println("\n ===============================================");

      	Scanner in = new Scanner (System.in);
      	String barang, cari, ganti, cari1,cari2,cari3;
        DoubleLinkedList keranjang = new DoubleLinkedList();

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
                     System.out.print("Jumlah Barang Yang Akan Dimasukkan Ke Dalam Keranjang : ");
                     int x = in.nextInt();
                     for (int i = 0; i < x; i++) {
                        System.out.print("Masukan Barang Ke Dalam Keranjang Ke-" + (i + 1) + " : ");
                        barang = in.next();
                        keranjang.insertLast(barang);
                     }
                     System.out.println ("Barang Yang Tersedia Di Dalam Keranjang : " + keranjang);
                     break;
                  
                  // case 2:
                  //    System.out.println ("Barang Yang Ada Pada Keranjang : " + keranjang);
                  //    System.out.print ("Barang Apa Yang Ingin Kamu Ganti : ");
                  //    cari1 = in.next();
                  //    if(keranjang.contains(cari1)){
                  //       System.out.println ("Barang Ada Didalam Keranjang");
                  //       System.out.print (cari1 + " Ada diurutan keberapa dalam keranjang itu? : ");
                  //       int nom = in.nextInt();
                  //       int nomt = nom -1;
                  //       System.out.print ("Ingin Menggantinya Dengan Apa : ");
                  //       ganti = in.next();
                  //       keranjang.set(nomt, ganti);
                  //       System.out.println ("Keseterdiaan Barang Terbaru Yang Ada Dalam Keranjang : "+ keranjang);
                  //    }else
                  //       System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                  //    break;
                  
                  case 3:
                     System.out.println ("Barang Yang Ada Pada Keranjang : " + keranjang);
                     System.out.print ("Mau Mengambil Barang Apa : ");
                     cari2 = in.next();
                     if(keranjang.contains(cari2)){
                        System.out.println("Barang Tersedia Didalam Keranjang");
                        System.out.print ("Pada Urutan Keberapa : ");
                        int no = in.nextInt();
                        int not = no - 1;
                        System.out.println("Silakan Diambil : "+keranjang.deleteKey(not));
                        System.out.println ("Kesediaan Barang Terbaru Yang Ada Dalam Keranjang : "+ keranjang);
                     }else{
                        System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                     }
                     break;
                  
                  case 4:
                     if(keranjang.isEmpty())
                        System.out.println("Tidak Ada Barang Dalam Keranjang");
                     else
                        System.out.println("Ada Barang Dalam Keranjang");
                  break;

                  case 5:
                     System.out.println ("Barang Dalam Keranjang : " + keranjang);
                     break;

                  // case 6 :
                  //    //Mengecek Apakah Sebuah Element ada Didalam LingkedList
                  //    System.out.println ("Barang Yang Tersedia Di Dalam Keranjang : " + keranjang);
                  //    System.out.print ("Masukkan Barang Yang Ingin Di Cari Dalam Keranjang : ");
                  //    cari3 = in.next();
                  //    if(keranjang.contains(cari3))
                  //       System.out.println("Barang Tersedia Didalam Keranjang");
                  //    else
                  //       System.out.println("Maaf, Barang Tidak Ada Dalam Keranjang");
                  //    break;

                  case 7 : 
                     System.out.println("Jumlah Barang Dalam Keranjang : "+keranjang.size());

            }
            System.out.println(" _______________________________________________\n");
            System.out.print("Mau pilih menu lain? ('Y' atau 'T')  ");
            jwb = in.next().charAt(0);
            
         } while (jwb == 'y' || jwb == 'Y');
         System.out.println("\nSELAMAT BERBELANJA KEMBALI :)");
   
    }
}