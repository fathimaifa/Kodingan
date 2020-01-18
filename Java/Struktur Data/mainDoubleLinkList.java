import java.util.*;
class node{
     private node next;
     private node prev;
     private String data;
     private String nama;
     private String NIM;
     public node (String input){
         data = input;
     }
     public String getData(){
         return data;
     }
     public void  setNext(node input){
         next = input;
     }
     public node getNext(){
         return next;
     }
     public void setPrev(node input){
         prev = input;
     }
     public node getPrev(){
         return prev;
     }
} 

class doubleLinkList{
    private node first; //menyimpan node pertama
    private node last; //menyimpan node terakhir Linklist
    private node temp; //variabel pembantu
    private node index; //variabel pembantu

    public void addFirst(String input){ //menambah node diawal
            node n = new node(input); //membuat node
            if(first==null){ //kondisi linklist kosong
                first=n; //mengeset n pada first dan last
                last=n;
            }
            else{   //kondisi sama ketika berisi 1 node dan banyak node
                n.setNext(first); //mengeset pointer next pada node n menuju ke first
                first.setPrev(n); //mengeset pointer prev pada node first menuju ke n
                first = n;  //menjadikan n sebagai first
            }
    }

    public void addAfterFirst(String input){ //menambah node ke setelah pertama
        node n = new node(input);
        if(first==null){
            first=n;
            last=n;
        }
        else if(first==last){
            first.setNext(n); //ada beberapa alternatif penulisan
            n.setPrev(first);
            last=n;
        }
        else{    //node dalam linklist lebih dari satu
            index = first.getNext();
            n.setNext(index);
            index.setPrev(n);
            first.setNext(n);
            n.setPrev(first);
        }
    }

    public void addBeforeLast(String input){  //menambah node sebelum terakhir implementasikan...
        node n = new node(input);
        if(first==null){
            first=n;
            last=n;
        }
        else if(first==last){
            last.setPrev(n);
            n.setNext(first);
            first=n;
        }
        else{
            index=last.getPrev();
            n.setNext(last);
            last.setPrev(n);
            index.setNext(n);
            n.setPrev(index);
        }
    }
    public void addLast(String input){  //menambah node pada akhir implementasikan.....
        node n = new node(input);
        if(first==null){
            first=n;
            last=n;
        }
        else if(first==last){
            first.setNext(n);
            n.setPrev(first);
            last=first.getNext();
        }
        else{
            last.setNext(n);
            n.setPrev(last);
            last=n;                
        }
    }

    public String removeFirst(){
            if (first==null){
                    return null;
            }
            else if (first == last){
                    temp = first;
                    first = null;
                    last = null;
                    return temp.getData();
            }
            else{
                    temp = first;
                    first = first.getNext();
                    first.getPrev().setNext(null);
                    first.setPrev(null);
                    return temp.getData();
            }
        }
    public String removeLast(){ //implementasikan
        if(first==null){
            return null;
        }
        else if(first==last){
            temp=first;
            first=null;
            last=null;
            return temp.getData();
        }
        else{
            temp=last;
            last=temp.getPrev();
            temp.setPrev(null);
            last=null;
            return temp.getData();
        }
    }

    public String getFirst(){
        if (first!=null){
            return first.getData();
        }
        else{
            return null;
        }
    }

    public String getLast(){
        if (first!=null){
            return last.getData();
        }
        else{
            return null;
        } 
    }
}

public class mainDoubleLinkList {
    public static void main(String []args){
        boolean kondisi = true;
        doubleLinkList ojk = new doubleLinkList();
        while(kondisi){
            System.out.println("\nPROGRAM DOUBLE LINK LIST");
            System.out.println("==============================");
            System.out.println("Memilih menu");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah setelah awal");
            System.out.println("3. Tambah sebelum akhir");
            System.out.println("4. Tambah di akhir");
            System.out.println("5. Hapus di awal");
            System.out.println("6. Hapus di akhir");
            System.out.println("7. Lihat awal");
            System.out.println("8. Lihat akhir");
            System.out.println("9. Keluar");
            System.out.println("==============================");
            System.out.print(">> ");            
            Scanner kal = new Scanner(System.in);
            int menu = kal.nextInt();
            System.out.println("==============================\n");
            Scanner dt = new Scanner(System.in);
            if(menu==1){
                System.out.print("Masukan data : ");
                String data1 = dt.nextLine();
                ojk.addFirst(data1);
            }
            else if(menu==2){
                System.out.print("Masukan data : ");
                String data2 = dt.nextLine();
                ojk.addAfterFirst(data2);
            }
            else if(menu==3){
                System.out.print("Masukan data : ");
                String data3 = dt.nextLine();
                ojk.addBeforeLast(data3);
            }
            else if(menu==4){
                System.out.print("Masukan data : ");
                String data4 = dt.nextLine();
                ojk.addLast(data4);
            }
            else if(menu==5){
                if(ojk.getFirst()!=null){
                    ojk.removeFirst();
                    System.out.println("Data telah dihapus !!");
                }
                else{
                    System.out.println("Data kosong !!");
                }
            }
            else if(menu==6){
                if(ojk.getLast()!=null){
                    ojk.removeLast();
                    System.out.println("Data telah dihapus !!");
                }
                else{
                    System.out.println("Data kosong !!");
                }
            }
            else if(menu==7){
                if(ojk.getFirst()==null){
                    System.out.print("data kosong");
                }
                else{
                    System.out.println(ojk.getFirst());
                }
            }
            else if(menu==8){
                if(ojk.getLast()==null){
                    System.out.print("data kosong");
                }
                else{
                    System.out.println(ojk.getLast());
                }
            }
            else if(menu==9){
                kondisi=false;
            }
        }
    }
}