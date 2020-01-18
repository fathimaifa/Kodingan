import java.util.Hashtable;
import java.util.Enumeration;
import java.util.*;

public class tugas13 {
 
 public static void main(String[] args) {
   Scanner in = new Scanner(System.in);
   Enumeration names;
   Integer key;
 
   
   Hashtable<Integer, String> hashtable = new Hashtable<Integer, String>();

   System.out.println("Kamus Informatika");
   System.out.println("Daftar kata yang mungkin dicari");
   System.out.println("1. Algoritma \n2. Pseudo Code \n3. java \n4. Kotlin \n5. Html ");
   System.out.println("\n6. Integer \n7. Rekursif \n8. Flow Chart \n9. React Native \n10. Sublime Text ");
   System.out.println("\n11. Android Studio \n12. float \n13. String \n14. default \n15. Array ");
   System.out.println("\n16. Visual Studio Code \n17. Null \n18. Kabel \n19. javasript \n20. css ");

   hashtable.put(1,"Algoritma adalah langkah langkah menyelesaikan masalah");
   hashtable.put(2,"Kode yang ditulis oleh kata - kata");
   hashtable.put(3,"java adalah bahasa pemrograman untuk backend");
   hashtable.put(4,"kotlin adalah bahasa backend terbaru yang menjadi pesaing java");
   hashtable.put(5,"Html adalah bahasa pemrograman front end yang biasa digunkan dalam pengembangan web");
   hashtable.put(6,"Integer adalah salah satu tipe data dalam untuk memuat angka dalam bilangan bulat");
   hashtable.put(7,"Rekursif adalah sebuat method yang dapat memanggil dirinya sendiri");
   hashtable.put(8,"flow chart adalah sebuat diagram alur yang digambarkan dalam sebuah bentuk yang memiliki arti tertentu ");
   hashtable.put(9,"React native adalah sebua framework untuk memgembangankan aplikasi berbasis web");
   hashtable.put(10,"Sublime text adalah sebuah kode editor untuk menulis kodingan kita");
   hashtable.put(11,"android studio adalah sebuat platform pengembangan aplikasi yang dikhususkan bagi pengguna android");
   hashtable.put(12,"Float adalah tipe data yang dapat memuat bingan dalam bentuk desimal");
   hashtable.put(13,"String adalah tipe data yang dapat memuat sebuat huruf");
   hashtable.put(14,"Array dapat digunakan untuk menyimpan data dalam dalam bentuk Integer maupun String");
   hashtable.put(15,"Visual Studi Code sama dengan Sublime text hanya saja dalam VSC banyak bahasa yang dapat digunakan dala satu kode editor");
   hashtable.put(16,"Null adalah keadaan ketika tidak memiliki nilai");
   hashtable.put(17,"kabel adalah sebuah alat yang dapat mengantarkan data atau listrik");
   hashtable.put(18,"default adalah data yang di set dari awal");
   hashtable.put(19,"javasript adalh bahasa pemrograma yang dapat digunkan untuk backend maupun front end");
   hashtable.put(20,"css dapat membuat tampilan web semakin cantik");



   //cari Data
   System.out.println("\nMasukan kode data yang akan dicari (misal Algoritma, tulis angka 1) : ");
   int x = in.nextInt();

   System.out.println(hashtable.getOrDefault(x,"gaada dikamus"));
   

   //Data yang akan dicari
 
 
 }
}
