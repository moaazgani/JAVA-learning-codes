import java.util.HashSet;

public class important {
    public static void subsequenses(String str, int idx, String newstr, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
        }
        char currchar = str.charAt(idx);
        
        subsequenses(str, idx+1, newstr+currchar, set);
        subsequenses(str, idx+1, newstr, set);
    }
    public static void main(String args[]){
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subsequenses(str, 0, "", set);

    }
}
// IMPORTENT