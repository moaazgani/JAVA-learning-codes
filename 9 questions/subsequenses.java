public class subsequenses {
    public static void subchar(String str, int idx, String newstr){
        if(idx == str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        
        subchar(str, idx+1, newstr+currchar);
        subchar(str, idx+1, newstr);
    }
    public static void main(String args[]){
        String str = "abc";
        subchar(str, 0, "");

    }
}
// IMPORTENT