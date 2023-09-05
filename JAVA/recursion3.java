public class recursion3 {
    //permutation of a string
    /*public static void printPerm(String str, String Permutation){
        if(str.length() == 0){
            System.out.println(Permutation);
            return;
        }
        for(int i = 0; i < str.length(); i++){
            char currChar = str.charAt(i);
            String newString = str.substring(0, i) + str.substring(i+1);
            printPerm(newString, Permutation + currChar);
        }
    }
    public static void main(String args[]){
        String str = "abc";
        printPerm(str, "");
    }*/



    //cross the maze
    /*public static int countPath(int i,int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        int rightPath = countPath(i+1, j, n, m);
        int downPath = countPath(i, j+1, n, m);
        return rightPath + downPath;
    }
    
    public static void main(String args[]){
        int n = 3;
        int m = 3;
        int totalPaths = countPath(0, 0, n, m);
        System.out.println(totalPaths);
    }*/
}
