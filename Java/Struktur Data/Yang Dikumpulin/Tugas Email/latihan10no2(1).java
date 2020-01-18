import java.util.*;  
class latihan10no2{  
   public static void main(String args[]){  
      ArrayList<String> alist=new ArrayList<String>();  
       Scanner input = new Scanner(System.in);
      while (input.hasNextLine()){
            String line = input.nextLine();
            if (line.isEmpty()) {
                break;
            }
            alist.add(line);
         }
         for (String s : alist ) {
             System.out.println(s);
         }
//displaying elements
      System.out.println(alist);
  
      //Adding "Steve" at the fourth position
      // alist.add(3, "Steve");
  
      //displaying elements
      // System.out.println(alist);
   }  
}
