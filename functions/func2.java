import java.util.*;

public class func2 {
    public static int calculateSum(int a, int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        int sum = calculateSum(a, b);
        System.out.print("The sum is: "+ sum);
         sc.close();
    }
}
