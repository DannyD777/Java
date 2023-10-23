package p7;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Map<String, String> collection = new HashMap<>();

        for (int i = 0; i < 10000; i++) {
            String id = generateUniqueId();
            collection.put(id, "Element " + i);
        }

        // Вывод коллекции
        for (Map.Entry<String, String> entry : collection.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

    private static String generateUniqueId() {
        return UUID.randomUUID().toString();
    }
}
