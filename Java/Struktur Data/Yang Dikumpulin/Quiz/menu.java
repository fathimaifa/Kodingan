import java.util.*;

/* Class BTNode */
class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }

    public void tampil() {
        System.out.print("{" + data + "}");
    }
}

class LinkedList {
    Node first;

    public LinkedList() {
        first = null;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void addFirst(String data) {
        Node node = new Node(data);
        node.next = first;
        first = node;
    }

    //menambah data dari simpul terakhir
    public void addLast(String data) {
        Node node, help;
        node = new Node(data);
        node.next = null;

        if (isEmpty()) {
            first = node;
            first.next = null;
        } else {
            help = first;
            while (help.next != null) {
                help = help.next;
            }
            help.next = node;
        }
    }

    //menghapus data dari simpul pertama
    public Node deleteFirst() {
        if (!isEmpty()) {
            Node temp = first;
            first = first.next;
            return temp;
        } else {
            return null;
        }
    }

    //menghapus data dari simpul terakhir
    public Node deleteLast() {
        if (!isEmpty()) {
            Node temp, current;
            current = first;
            while (current.next.next != null) {
                current = current.next;
            }
            temp = current.next;
            current.next = null;
            return temp;
        } else {
            Node temp = first;
            first = null;
            return temp;
        }
    }

    //menampilkan isi linked list
    public void tampilkan() {
        Node current = first;
        if (current == null) {
            System.out.println("kosong");
        } else {
            while (current != null) {
                current.tampil();
                current = current.next;
            }
            System.out.println();
        }
    }
}


public class menu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TreeSet<String> tset = new TreeSet<String>();
        LinkedList link = new LinkedList();
        System.out.println("\n=============================================");
        System.out.println("===========ABSEN PRAKTIKUM KELAS D===========");
        System.out.println("=============================================");
        char ch;
        do {
            System.out.println("DAFTAR MENU:");
            System.out.println("1. Isi Absen ");
            System.out.println("2. Urutan Siswa Sesuai Daftar Hadir");
            System.out.println("3. Urutan Nama Siswa Yang Hadir Sesuai Abjad");
            System.out.print("Pilih: ");
            int choice = in.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    int n;
                    String cari;
                    boolean found = false;
                    System.out.println("ISI ABSEN");
                    System.out.print("banyak siswa : ");
                    n = in.nextInt();

                    String nama[] = new String[n];

                    for (int i = 0; i < n; i++) {
                        System.out.print((i + 1) + ". ");
                        nama[i] = in.next();
                        link.addFirst(nama[i]);

                    }
                    for (int i = 0; i < n; i++) {
                        tset.add(nama[i]);
                    }
                    break;

                case 2:
                    System.out.println("NAMA SISWA SESUAI DAFTAR URUTAN HADIR");
                    System.out.println("(dari yang terahir hadir sampai yang pertama hadir) : ");
                    link.tampilkan();
                    break;
                    
                case 3:
                    System.out.println("URUTAN NAMA SISWA YANG HADIR SESUAI ABJAD: ");
                    System.out.println("nama sesudah diurutkan");
                    System.out.println(tset);
                    break;

                default:
                    System.out.println("Harap pilih menu dengan benar! \n ");
                    break;
            }

            System.out.print("Pilih menu lain? (y atau n): ");
            ch = in.next().charAt(0);
            System.out.println();
        } while (ch == 'Y' || ch == 'y');
    }
}