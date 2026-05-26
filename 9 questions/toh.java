public class toh {
    public static void towerofhinoi(int n, String src, String hel, String dis){
        if(n == 1){
            System.out.println("Transfer disk " + n + " from " + src + " to " + dis);
            return;
        }
        towerofhinoi(n - 1, src, dis, hel);
        System.out.println("Transfer disk " + n + " from " + src + " to " + dis);
        towerofhinoi(n - 1, hel, src, dis);
    }
    public static void main(String args[]){
        int n = 3;
        towerofhinoi(n, "S", "H" ,"D");
        int steps = (1 << n) - 1;
        System.out.println("Total number of steps: " + steps);
    }
}