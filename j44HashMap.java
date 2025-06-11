import java.util.*;

public class j44HashMap {
    public static void main(String args[]){
        Map<String, Integer> mp = new HashMap<>();
        mp.put("A", 10);
        mp.put("B", 20);

        System.out.println(mp);
        System.out.println(mp.get("A"));

        mp.put("B", 60);
        System.out.println(mp);

        System.out.println(mp.keySet());
        for(String key: mp.keySet()){
            System.out.println(key + ": " + mp.get(key));
        }

        System.out.println(mp.values());

    }
}
