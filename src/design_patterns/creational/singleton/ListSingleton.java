package design_patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class ListSingleton {
    private static List<String> listString;

    // Private constructor to prevent external instantiation
    private ListSingleton() {

    }

    // Static method with a global point of access to the instance
    public static List<String> getInstance() {
        if (listString == null) {
            // synchronized is important to make sure object initialization is only done once.
            synchronized (List.class) {
                if (listString == null) {
                    listString = new ArrayList<>();
                }
            }
        }
        return listString;
    }
}
