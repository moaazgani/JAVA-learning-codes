import java.util.*;

class helo{
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("India", 100);
        map.put("china", 120);
        map.put("nepal", 130);
        System.out.println(map);

        // map.remove("India");
        // System.out.println(map);

        if(map.containsKey("china")){
            System.out.println(true);
        }
        else{
            System.out.println(false);;
        }

        System.out.println(map.get("china"));
        System.out.println(map.get("india"));

        // loop1
        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.print(e.getKey() + ": ");
           System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        // loop2
       for(String key : keys) {
           System.out.println(key+ " " + map.get(key));
       }
    }
}