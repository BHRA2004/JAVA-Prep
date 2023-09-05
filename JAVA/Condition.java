import java.util.*;

public class Condition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        //if(age>18){
            //System.out.println("Adult");
        //}else{
            //System.out.println("Not Adult");
       // }
       
       
       switch(x){
       case 1 : System.out.println("Hello");
       //break;
       case 2 : System.out.println("Namaste");
       break;
       case 3 : System.out.println("Bonjour");
       break;
       default: System.out.println("Wrong input");
       break;
       }
    }
}
