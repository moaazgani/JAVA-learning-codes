import java.util.*;

public class factfunc {
    public static void printfactorial(int n) {
        if (n<0){
            System.out.print("invalid");
            return;
        }
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.print(factorial);
    }

    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        printfactorial(n);
        sc.close();
    }
}
