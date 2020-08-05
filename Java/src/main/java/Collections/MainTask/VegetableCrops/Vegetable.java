package Collections.MainTask.VegetableCrops;

abstract public class Vegetable {

    private String name;
    private String vegetableCrops;
    private double kcalPer100g;
    private double weight; //in grams

    public Vegetable(String name) {
        this.name = name;
    }

    public Vegetable(String name, double kcalPer100g) {
        this.name = name;
        this.kcalPer100g = kcalPer100g;
    }

    public Vegetable(String name, double kcalPer100g, double weight) {
        this.name = name;
        this.kcalPer100g = kcalPer100g;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return (weight + " grams of " + name + " (" + vegetableCrops + "), "
                + getCalorificValueOfProduct() + " kcal");
    }

    public String getName() {
        return name;
    }

    public String getVegetableCrops() {
        return vegetableCrops;
    }

    public double getKcalPer100g() {
        return kcalPer100g;
    }

    public double getWeight() {
        return weight;
    }

    public double getCalorificValueOfProduct(){
        return kcalPer100g * weight / 100.0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVegetableCrops(String vegetableCrops) {
        this.vegetableCrops = vegetableCrops;
    }

    public void setKcalPer100g(double kcalPer100g) {
        this.kcalPer100g = kcalPer100g;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

