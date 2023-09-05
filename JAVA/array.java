import java.util.*;

public class array{
    //linear search
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new int[size];
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        System.out.println("Enter the number to search");
        int x = sc.nextInt();
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("The number is at index:"+ i);
            }
        }
    }

    //enter names
    /*public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        for(int i = 0; i< size; i++){
            names[i] = sc.next();
        }
        System.out.print("Names:");
        for(int i = 0; i<size; i++){
            System.out.println(names[i]);
        }
    }*/ 
}