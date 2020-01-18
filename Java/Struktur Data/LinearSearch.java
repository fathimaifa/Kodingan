import java.util.Scanner;
 
class LinearSearch {
  public static void main(String args[]) {
    int c, n, search, array[];
 
    Scanner in = new Scanner(System.in);
    System.out.println("Enter number of elements");
    n = in.nextInt();
    array = new int[n];
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++){
      array[c] = in.nextInt();
    }
 
    System.out.println("Enter value to find");
    search = in.nextInt();
   
    for (c = 0; c < n; c++) {
      /* Searching element is present */
      if (array[c] == search) {
        System.out.println(search + " is present at location " + (c + 1) + ".");
        break;
      }
    }
    /* Element to search isn't present */
    if (c == n) {
      System.out.println(search + " isn't present in array.");
    }
  }
}

// import java.util.Scanner;
// class coba {
//    public static void main(String[] args) {
//       int i, jum, cari, elemen[];

//       Scanner in=new Scanner(System.in);
//       System.out.print("masukan banyaknya elemen: ");
//       jum = in.nextInt();
//       elemen = new int[jum];
//       System.out.println("masukan " + jum + "elemen: ");
//       for (i=0; i<jum ;i++ ) {
//          elemen[i]=in.nextInt();
//       }
//       System.out.print("masukan elemen yang akan dicari: ");
//       cari = in.nextInt();

//       for (i=0; i<jum; i++) {
//          if (elemen[i]==cari){
//             System.out.println(cari + " ada di lokasi " + (i+1));
//             break;
//          }
//          if (i==jum) {
//             System.out.println("elemen tidak ditemukan");
//          }

//       }
//    }
// }