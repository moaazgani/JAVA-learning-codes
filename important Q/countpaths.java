public class countpaths {
    public static int countpath(int i, int j, int n, int m){
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 || j == n-1){
            return 1;
        }
        int firstdirection = countpath(i+1, j, n, m);
        int secdirection = countpath(i, j+1, n, m);

        return firstdirection + secdirection;
    }
    public static void main(String args[]){
        int n = 3, m = 3;
        System.out.println(countpath(0, 0, n, m));
    }
}
