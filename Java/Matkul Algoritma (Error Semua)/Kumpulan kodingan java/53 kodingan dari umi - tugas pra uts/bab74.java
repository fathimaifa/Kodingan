import java.util.*;
public class bab74 {
	public static void main (String[] args){
		Scanner in = new Scanner (System.in);
		float x, y, z, a, b, c, d;
		System.out.print( "Masukan sisi 1 segitiga : ");
		x = in.nextFloat();
		
		System.out.print("Masukan sisi 2 segitiga : ");
		y = in.nextFloat();
		
		System.out.print("Masukan sisi 3 segitiga : ");
		in.nextFloat();
		
		if(x>y){
			if((x>z)&&(y>z)){
				x=c;
				y=b;
				z=a;
			}else{
				x=c;
				y=a;
				z=b;
			}

		}else if(y>x){
			if((y>z)&&(x>z)){
				x=b;
				y=c;
				z=a;
			}else{
				x=a;
				y=c;
				z=b;
			}

		}else{
			if((z>y)&&(y>x)){
				z=c;
				y=b;
				x=a;
			}else{
				z=c;
				y=a;
				x=b;
			}
		}
		d=pow(c,2);
		d=(pow(a,2)+pow(b,2));

		if(d>(pow(a,2)+pow(b,2))){
			System.out.print("segitiga tersebut merupakan segitiga tumpul.");
		}else if(d<(pow(a,2)+pow(b,2))){
			System.out.print("segitiga tersebut merupakan segitiga lancip.");
		}else{
			System.out.print("segitiga tersebut merupakan segitiga siku siku.");
		}
	}
}