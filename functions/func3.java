import java.util.*;

public class func3{
    public static int calculatemultiply(int a , int b){
        return a*b;
    }
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("This is product of two numbers: "+ calculatemultiply(a, b));
        sc.close();
    }
}
