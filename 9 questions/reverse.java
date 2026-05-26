public class reverse {
    public static void printreverse(String str, int idx){
        if(idx == 0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printreverse(str, idx - 1);
    }
    public static void main(String args[]){
        String str = "abcd";
        printreverse(str, str.length() - 1);
    }
}
