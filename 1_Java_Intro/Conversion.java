public class Conversion {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit) {
            case "banana" -> System.out.println("monkey eats this");
            case "apple" -> System.out.println("humans eat this");
            case "mango" -> System.out.println("king of fruits");
            default -> System.out.println("Invalid fruit");
        }
    }
}