public class LinearSearch2 {
    public static int linearSearch(String[] menu, String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String[] menu = { "Pizza", "Burger", "Pasta", "Salad", "Soda", "Samosa", "Vada Pav", "Dhokla" };
        String key = "Samosa";

        int result = linearSearch(menu, key);
        if (result == -1) {
            System.out.println("Not found in the menu ");
        } else {
            System.out.println(key + " found at index: " + result);
        }
    }
}
