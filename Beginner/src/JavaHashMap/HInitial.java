package JavaHashMap;

import java.util.HashMap;

public class HInitial {
    public static void main(String[] args) {
        // HashMaps (key->value)

        HashMap users = new HashMap();
        users.put("Sandra", 21);
        users.put("Paul", 37);
        users.put("George", 74);

        System.out.println(users.entrySet());
    }
}
