public class countways {
    public static int countway(int n, int m){
        if(n == m){
            return 2;
        }
        if(n < m){
            return 1;
        }
        int vertical = countway(n - m, m);
        int horizontal = countway(n - 1, m);
        return vertical + horizontal;
    }
    public static void main(String args[]){
        int n = 4, m = 5;
        System.out.println(countway(n, m));
    }
}
