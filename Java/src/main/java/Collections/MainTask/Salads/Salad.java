package Collections.MainTask.Salads;

import Collections.MainTask.CaloriesComparator;
import Collections.MainTask.VegetableCrops.Vegetable;
import Collections.MainTask.WeightComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Salad {

    private String name;
    private List<Vegetable> ingredients = new ArrayList<Vegetable>();

    public Salad() {
        name = "Unknown";
    }

    public Salad(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Vegetable> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean addIngredients(Vegetable vegetable) {
        return ingredients.add(vegetable);
    }

    public void showSaladRecipe() {
        if (ingredients.isEmpty()) {
            System.out.println("You haven't added any ingredients yet!");
            return;
        }

        System.out.println("The salad " + name + " contains:");
        for (Vegetable vegetable : ingredients) {
            System.out.println(vegetable.toString());
        }

        System.out.println("============================");
        System.out.println("Total energy: " + countCalories() + " kcal");
    }

    public double countCalories() {
        double calories = 0.0;

        for (Vegetable vegetable : ingredients) {
            calories += vegetable.getCalorificValueOfProduct();
        }
        return calories;
    }

    public void sortIngredientsByCalories() {
        Collections.sort(ingredients, new CaloriesComparator());
    }

    public void sortIngredientsByWeight() {
        Collections.sort(ingredients, new WeightComparator());
    }

    public void showIngredientsByCalories(double lowerCalories, double upperCalories) {
        double calories;

        System.out.println("Ingredients for calories ["
                + lowerCalories + ", " + upperCalories + "]");
        for (Vegetable vegetable : ingredients) {
            calories = vegetable.getKcalPer100g();
            if (calories >= lowerCalories && calories <= upperCalories) {
                System.out.println(vegetable.getName() + ", "
                        + vegetable.getKcalPer100g() + " kcal per 100g");
            }
        }
    }
}
