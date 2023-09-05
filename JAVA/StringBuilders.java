public class StringBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("hello");
        for(int i = 0; i < sb.length()/2; i++){
            int front = i;
            int end = sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char endChar = sb.charAt(end);

            sb.setCharAt(front, endChar);
            sb.setCharAt(end, frontChar);
        }
        System.out.println(sb);
    }

}
