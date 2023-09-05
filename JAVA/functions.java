import java.util.*;
public class functions {
    //public static void printFactorial(int n){
        //if(n<0){
            //System.out.print("Invalid input");
            //return;
        //}
        //int factorial=1;
        //for(int i=n;i>=1;i--){
            //factorial = factorial*i;
        //}
        //System.out.println(factorial);
    //}

      //avg of three numbers
    //public static void main(String args[]){
      //  Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //int c = sc.nextInt();
        //int avg = (a+b+c)/3;
        //System.out.println(avg);
//}
    
    //to print sum of all odd numbers from 1 to n
    //public static void printSum(int n){
        //int sum = 0;
        //for (int i = 1; i <= n; i++){
          //  if(n%2 != 0){
            //    sum=sum+i;
            //}
        //}
        //System.out.print(sum);
    //}
    //public static void main(String arg[]){
      //  Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        //printSum(n);
    //}

    //to print the greater number
    //public static void compare(int a, int b){
      //  if(a>b){
        //    System.out.print(a);
        //}
        //else{
          //  System.out.print(b);
        //}
    //}
    //public static void main(String arg[]){
      //  Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //System.out.print("The greater number is:");
        //compare(a, b);
    //}

    //to find circumference
    //public static void main(String args[]){
      //  Scanner sc = new Scanner(System.in);
        //float r = sc.nextFloat();
        //System.out.print(2*3.14*r);
    //}

    //voting age
    //public static void votingAge(int age){
      //  if(age>=18)
        //System.out.print("Eligible to vote");
        //else
        //System.out.print("Not eligible to vote");
    //}
    //public static void main(String args[]){
      //  Scanner sc = new Scanner(System.in);
        //int age = sc.nextInt();
        //votingAge(age);
    //}

    //number of zeroes
    //public static void main(String args[]){
    //int positive = 0, negative = 0, zeros = 0;
      // System.out.println("Press 1 to continue & 0 to stop");
       //Scanner sc = new Scanner(System.in);
       //int input = sc.nextInt();


       //while(input == 1) {
         //  System.out.println("Enter your number : ");
           //int number = sc.nextInt();
           /*if(number > 0) {
               positive++;
           } else if(number < 0) {
               negative++;
           } else {
               zeros++;
           }
           System.out.println("Press 1 to continue & 0 to stop");
           input = sc.nextInt();
       }
       System.out.println("Positives : "+ positive);
       System.out.println("Negatives : "+ negative);
       System.out.println("Zeros : "+ zeros);
   }   */

   //infite do while loop
   /*public static void main(String args[]) {
    do {


    } while(true);
 }  */ 

//greatest common divisor of 2 numbers
/*public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();


    while(n1 != n2) { 
        if(n1>n2) {
            n1 = n1 - n2;
        } else {
            n2 = n2 - n1;
        }
    }
    System.out.println("GCD is : "+ n2);
}  */ 

//x^n
/*public static void main(String args[]) {
    System.out.println("Enter x");
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    System.out.println("Enter n");
    int n = sc.nextInt();


    int result = 1;
    //Please see that n is not too large or else result will exceed the size of int
    for(int i=0; i<n; i++) {
        result = result * x;
    }


    System.out.println("x to the power n is : "+ result);
} */

//fibonacci series
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
   
    int a = 0, b = 1;
       
    System.out.print(a+" ");
   
    if(n > 1) {
        //find nth term
        for(int i=2; i<=n; i++) {
            System.out.print(b+" ");
            //the concept below is called swapping
            int temp = b;
            b = a + b;
            a = temp;
        }


        System.out.println();
    }
}   


}    