import java.util.Scanner;

public class kalkulatorsederhana {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int op1,op2,hasil;
		char op;
		
		System.out.print("masukkan operand1: ");
		op1 = scan.nextInt();
		System.out.print("masukkan operator: ");
		op = scan.next().charAt(0);
		System.out.print("masukkan operand2: ");
		op2 = scan.nextInt();
		
		switch(op){
		case '+' : 	hasil = op1+op2;
					System.out.println("Hasil: "+hasil);break;
		case '-' : 	hasil = op1-op2;
		System.out.println("Hasil: "+hasil);break;
		case '*' : 	hasil = op1*op2;
		System.out.println("Hasil: "+hasil);break;
		case '/' : 	if(op2!=0){
						hasil = op1/op2;
						System.out.println("Hasil: "+hasil);break;
		}			else	
						System.out.println("Eror!");break;
		default : System.out.println("Kesalahan dalam input operator");break;
		}
		
	}

}
