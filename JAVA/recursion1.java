public class recursion1 {
public static void printSum(int n){
    if( i==n ){
        return;
    }
    System.out.println(n);
    printNum(n-1);
}

public static void main(String args[]){
    int n = 1;
    printNum(n);
}
}
