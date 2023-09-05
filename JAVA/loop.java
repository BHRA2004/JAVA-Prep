import java.util.Scanner;

public class loop {
    public static void main(String args[]){
        //for(int i=0;i<11;i++){
            //System.out.println("Hello World");
            //System.out.println(i);
        //} 

        //int i=0;
        //while(i<11){
            //System.out.print(i);
            //i++;
        //}

        //do{
        //    System.out.print(i);
        //    i++;
        //}while(i<11);



        //print the first n natual numbers
        int sum = 0;
      System.out.print("Enter the number value:: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      for (int i = 0; i<=num; i++){
         sum = sum +i;
      }
      System.out.println("Sum of numbers : "+sum);
    }
}
