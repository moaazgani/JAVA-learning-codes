import java.util.HashMap;

public class routes {
    public static String getStart(HashMap<String, String> ticket){
        HashMap<String, String> revmap = new HashMap<>();

        for(String key : ticket.keySet()){
            revmap.put(ticket.get(key), key);
        }
        for(String key : ticket.keySet()){
            if(!revmap.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("chennai", "bangaluru");
        tickets.put("Mumbai", "delhi");
        tickets.put("delhi", "goa");
        tickets.put("goa", "chennai");

        String start = getStart(tickets);   
        
        while(tickets.containsKey(start)){
            System.out.print(start + " -> ");
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
