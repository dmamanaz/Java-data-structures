package JavaHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HInitial {
    public static void main(String[] args) {
        // HashMaps (key->value)

        HashMap users = new HashMap();
        users.put("Sandra", 21);
        users.put("Paul", 37);
        users.put("George", 74);

        Iterator iterator = users.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry pair = (Map.Entry) iterator.next();
            System.out.println(pair.getKey() + ", " + pair.getValue());
        }

        System.out.println(users.get("Sandra"));
        System.out.println(users.get("George"));
        System.out.println(users.remove("Sandra"));
        //System.out.println(users.entrySet());
    }
}
