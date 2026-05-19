import java.util.*;
public class arrayy {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int num[] = new int[size];

        for(int i=0; i<size; i++){
            num[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0; i<num.length; i++){
            System.out.println(num[i]);
            if(num[i] == x){
                System.out.println("x foun at index: "+ i);
            }
        }

        // int[] marks = new int[3];
        // int marks[] = {20,19,19};
        // marks[0] = 97;
        // marks[1] = 100;
        // marks[2] = 99;
        // for(int i=0 ; i<3; i++){
        //     System.out.println(marks[i]);
        // }
        // System.out.println(java.util.Arrays.toString(marks));
        sc.close();
    }
}
