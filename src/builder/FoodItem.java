package builder;

public class FoodItem {

    private final int serviceSize;
    private final int noOfServings;
    private final int calories;
    private final int fat;
    private final int enegy;

    public FoodItem(Builder builder) {
        this.serviceSize = builder.serviceSize;
        this.noOfServings = builder.noOfServings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.enegy = builder.energy;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "serviceSize=" + serviceSize +
                ", noOfServings=" + noOfServings +
                ", calories=" + calories +
                ", fat=" + fat +
                ", enegy=" + enegy +
                '}';
    }

    public static class Builder {
        private  int serviceSize;
        private  int noOfServings;
        private  int calories;
        private  int fat;
        private  int energy;

        public Builder(int serviceSize, int noOfServings) {
            this.serviceSize = serviceSize;
            this.noOfServings = noOfServings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder energy(int energy) {
            this.energy = energy;
            return this;
        }

        public FoodItem build() {
            return new FoodItem(this);
        }
    }
}
