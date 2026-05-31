import java.util.ArrayList;
import java.util.Collections;

public class Arraylists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(5);
        list.add(6);
        list.add(4);
        System.out.println(list);
        
        //get elements
        int element = list.get(0);
        System.out.println(element);

        //how to add elements in between
        list.add(2,2);
        System.out.println(list);

        //set element anywhere
        list.set(0,10);
        System.out.println(list);

        // For delete element pass index
        list.remove(0);
        System.out.println(list);

        //length or size
        int size = list.size();
        System.out.println(size);

        //loopppppsss
        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sort
         Collections.sort(list);
         System.out.println(list);
    }
}
