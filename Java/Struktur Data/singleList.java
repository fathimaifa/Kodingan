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

public class singleList{
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
		
		for(int i=0; i<n; i++){
			System.out.print((i+1)+". ");
				nama[i]=in.next();
			link.addFirst(nama[i]);
				
		}
		for(int i=0; i<n; i++){
			tset.add(nama[i]);
		}
		System.out.println("nama sebelum diurutkan");
		link.tampilkan();
		System.out.println("nama sesudah diurutkan");
		System.out.println(tset);
		
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
		
		
		
		
		
	}
}