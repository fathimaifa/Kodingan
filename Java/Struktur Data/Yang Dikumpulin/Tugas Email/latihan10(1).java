import java.util.*;
import java.util.TreeSet;
	public class latihan10 {
  		public static void main(String args[]) {
     	// TreeSet of String Type
 		TreeSet<String> tset = new TreeSet<String>();
        Scanner input = new Scanner(System.in);

         while (input.hasNextLine()){
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            }
            tset.add(line);
         }
         for (String s : tset ) {
             System.out.println(s);
         }
    	 //Displaying TreeSet
    	 System.out.println(tset);
		   // TreeSet of Integer Type
    	 TreeSet<Integer> tset2 = new TreeSet<Integer>();
    	 // Adding elements to TreeSet<Integer>
   //  	 tset2.add(88);
   //  	 tset2.add(7);
   //  	 tset2.add(101);
		 // tset2.add(0);
   //  	 tset2.add(3);
   //  	 tset2.add(222);
    	 // System.out.println(tset2);
    	 }
 }
