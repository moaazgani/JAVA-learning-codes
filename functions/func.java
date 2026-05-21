import java.util.*;

public class func {
    public static void printMyName(String name){
        System.out.print(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.next();
        printMyName(name);
         sc.close();
    }
}