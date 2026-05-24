public class xkipown {
    public static int calpow(int x, int n){
        if (n == 0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        int xx = calpow(x, n-1);
        int xn = x * xx;
        return xn;

    }
    public static void main(String args[]){
        int x = 2; int n = 5;
        int ans = calpow(x, n);
        System.out.println(ans);
    }
}
