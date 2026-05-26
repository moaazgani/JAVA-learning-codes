public class movex {
    public static void movexs(String str, int idx, int count, String newstr){
        if(idx == str.length()){
            for(int i=0; i<count; i++){
                newstr += 'x';
            }
            System.out.println(newstr);
            return;
        }
        char currchar = str.charAt(idx);
        if(currchar == 'x'){
            count++;
            movexs(str, idx+1, count, newstr);
        }
        else{
            newstr += currchar;
            movexs(str, idx+1, count, newstr);
        }
    }
    public static void main(String args[]){
        String str = "axbxcxd";
        movexs(str, 0, 0, "");
    }
}
