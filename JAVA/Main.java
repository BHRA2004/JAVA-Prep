
import java.util.*;

public class Main {
    /*public static void main(String[] args) {
        System.out.println("Enter a and b");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        System.out.println(c);
    }*/
   char o;
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no. 1 : ");
    int x= sc.nextInt();
    System.out.println("Enter no. 2 : ");
    int y= sc.nextInt();
    System.out.println("Enter Operator : ");
   
    char o = sc.next().charAt(0);
    int a;
    switch(o){
        case'+':
         a=x+y;
        System.out.println("Sum is : " + a);
        break;
         case'-':
         a=x-y;
        System.out.println("Difference is : " + a);
        break;
         case'*':
         a=x*y;
        System.out.println("Product is : " + a);
        break;
         case'/':
         a=x/y;
        System.out.println("Quotient is : " + a);
        break;
    }
   } 
}

