import java.util.HashSet;
import java.util.Iterator;

class example {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(4);
        set.add(6);
        set.add(5);
        set.add(3);
        set.add(9);
        set.add(8);
        set.add(7);

        System.out.println(set);
        set.remove(9);

        if(set.contains(8)){
            System.out.println(true);
        }
        if(!set.contains(9)){
            System.out.println(false);
        }

        System.out.println("size of set is " + set.size());

        Iterator i = set.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}