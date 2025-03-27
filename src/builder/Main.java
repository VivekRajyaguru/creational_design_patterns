package builder;

public class Main {
    public static void main(String[] args) {
        FoodItem foodItem = new FoodItem.Builder(10, 15).build();
        System.out.println(foodItem);
    }
}
