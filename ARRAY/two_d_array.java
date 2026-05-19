import java.util.Scanner;

public class two_d_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows: ");
        int row = sc.nextInt();
        System.out.println("Enter colums: ");
        int col = sc.nextInt();

        int number[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                number[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                    if(number[i][j] == x){
                    System.out.println("Num found in: (" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
