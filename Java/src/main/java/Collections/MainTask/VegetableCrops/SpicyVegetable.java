package Collections.MainTask.VegetableCrops;

public class SpicyVegetable extends Vegetable {

    public SpicyVegetable(String name, double calories) {
        super(name, calories);
        setVegetableCrops("Spicy vegetables");
    }

    public SpicyVegetable(String name, double calories, double weight) {
        super(name, calories, weight);
        setVegetableCrops("Spicy vegetables");
    }
}

