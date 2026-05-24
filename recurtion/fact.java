public class fact {
    public static int factorial(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int fact = factorial(n-1);
        int cfact = n * fact;
        return cfact;
    }
    public static void main(String args[]){
        int n = 5;
        int cal = factorial(n);
        System.out.println(cal);
    }
}
