package restaurantmanager;

import java.util.*;


public class MenuManager {
    private static final Map<String, Integer> menu = new LinkedHashMap<>();

    static {
        // Store items in lowercase internally
        menu.put("pizza", 150);
        menu.put("burger", 100);
        menu.put("pasta", 120);
        menu.put("sandwich", 80);
        menu.put("coffee", 50);
    }

    // Show the menu to user in proper format
    public static void showMenu() {
        System.out.println("===== Food Menu =====");
        for (Map.Entry<String, Integer> entry : menu.entrySet()) {
            String item = capitalize(entry.getKey());
            System.out.println(item + " - ₹" + entry.getValue());
        }
    }

    // Check if item exists (case-insensitive)
    public static boolean isItemAvailable(String item) {
        return menu.containsKey(item.toLowerCase());
    }

    // Get price of item (case-insensitive)
    public static int getPrice(String item) {
        return menu.get(item.toLowerCase());
    }

    // Make first letter uppercase
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
    }

    // Optional: Add item to menu (admin use)
    public static void addMenuItem(String item, int price) {
        menu.put(item.toLowerCase(), price);
        System.out.println(capitalize(item) + " added to menu at ₹" + price);
    }
}

    