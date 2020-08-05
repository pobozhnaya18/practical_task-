package Collections.MainTask.VegetableCrops;

public class LeafstalkVegetables extends Vegetable {

    public LeafstalkVegetables(String name, double kcalPer100g) {
        super(name, kcalPer100g);
        setVegetableCrops("Leafstalk vegetables");
    }

    public LeafstalkVegetables(String name, double kcalPer100g, double weight) {
        super(name, kcalPer100g, weight);
        setVegetableCrops("Leafstalk vegetables");
    }
}
