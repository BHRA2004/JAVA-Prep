import java.util.HashSet;

public class recursion2 {
   /*   public static void towerOfHanoi(int n, String src, String helper, String dest){
        if(n==1){
            System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("tranfer disk "+n+" from "+src+" to "+dest);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String args[]){
        int n=2;
        towerOfHanoi(n, "S","H", "D" );
    }*/




    //string in reverse
    /*public static void printRev(String str, int index){
        if(index == 0){
            System.out.println(str.charAt(index));
            return;
        }
        System.out.println(str.charAt(index));
        printRev(str, index-1);
    }
    public static void main(String args[]){
        String str = "bhramari";
        printRev(str,str.length()-1);
    }*/




     /*public static int first = -1;
     public static int last = -1;
public static void getIndices(String str, char el, int idx) {
if(idx == str.length()) {
return;
}
if(str.charAt(idx) == el) {
if(first == -1) {
first = idx;
} else {
last = idx;
}
}
getIndices(str, el, idx+1);
}
public static void main(String args[]) {
String str = "tabcdfghijakkk";
char el = 'a';
getIndices(str, el, 0);
System.out.println("First occurence : " + first);
System.out.println("Last occurence : " + last);
}*/



//checking sorted array
/*public static boolean isSorted(int arr[], int index){
    if(index == arr.length-1){
        return true;
    }
    if(arr[index]<arr[index+1]){
        //array is sorted till here
        return isSorted(arr, index+1);
    }else{
        return false;
    }
}
public static void main(String args[]){
    int arr[] = {1,3,4,6,2};
    System.out.println(isSorted(arr, 0));
    
}*/


//move x to the end
/*public static void moveAllX(String str, int idx, int count, String newString){

    if(idx == str.length()){
        for(int i = 0; i<count; i++){
            newString += 'x';
        }
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(currChar == 'x'){
        count++;
        moveAllX(str, idx+1, count, newString);
    }else{
        newString += currChar;
        moveAllX(str, idx+1, count, newString);
    }
}

public static void main(String args[]){
    String str = "axxbcxd";
    moveAllX(str, 0, 0, "");
}*/


//remove duplicates
/*public static boolean[] map = new boolean[26];

public static void removeDuplicates(String str, int idx, String newString){
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    if(map[currChar - 'a'] == true){
        removeDuplicates(str, idx+1, newString);
    }else{
        newString += currChar;
        map[currChar - 'a'] = true;
        removeDuplicates(str, idx+1, newString);
    }
}

public static void main(String args[]){
    String str = "abbccda";
    removeDuplicates(str, 0, "");
}*/


//subsequenes of string
/*public static void subsequences(String str, int idx, String newString){
    if(idx == str.length()){
        System.out.println(newString);
        return;
    }
    char currChar = str.charAt(idx);
    //to be
    subsequences(str, idx+1, newString+currChar);

    //to not be
    subsequences(str, idx+1, newString);
}
public static void main(String args[]){
    String str = "abc";
    subsequences(str, 0, "");
}*/


//hashset
/*public static void subsequences(String str, int idx, String newString, HashSet<String> set){
    if(idx == str.length()){
        if(set.contains(newString)){
            return;
        }else{
            System.out.println(newString);
            set.add(newString);
            return;
        }
    }
    char currChar = str.charAt(idx);
    //to be
    subsequences(str, idx+1, newString+currChar, set);

    //to not be
    subsequences(str, idx+1, newString, set);
}
public static void main(String args[]){
    String str = "aaa";
    HashSet<String> set = new HashSet<>();
    subsequences(str, 0, "", set);
}*/


//keypad combination
public static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

public static void printComb(String str, int idx, String Combination){
    if(idx == str.length()){
        System.out.println(Combination);
        return;
    }

    char currChar = str.charAt(idx);
    String mapping = keypad[currChar - '0'];
    for(int i = 0; i < mapping.length(); i++){
        printComb(str, idx+1, Combination + mapping.charAt(i));
    }
}
public static void main(String args[]){
    String str = "45";
    printComb(str, 0, "");
}
}
