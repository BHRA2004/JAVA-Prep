import java.util.*;

public class Strings {
    /*public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
     int size = sc.nextInt();
     String array[] = new String[size];
     int totLength = 0;
      for(int i=0; i<size; i++) {
       array[i] = sc.next();
       totLength += array[i].length();
     }
     System.out.println(totLength);
   }*/

   //'e' to 'i'
   public static void main(String main[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
     String result = "";


     for(int i=0; i<str.length(); i++) {
       if(str.charAt(i) == 'e') {
         result += 'i';
       } else {
         result += str.charAt(i);
       }
     }


     System.out.println(result);
   } 
}
