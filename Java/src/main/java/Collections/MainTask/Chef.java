package Collections.MainTask;

import Collections.MainTask.Salads.Salad;
import Collections.MainTask.VegetableCrops.Vegetable;

import java.lang.reflect.Constructor;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Chef {
    private String name;
    private Salad salad;

    public Chef() {
        name = "Bob";
        salad = new Salad();
    }

    public Chef(String name) {
        this.name = name;
        salad = new Salad();
    }

    public Chef(String name, Salad salad) {
        this.name = name;
        this.salad = salad;
    }

    public Vegetable getIngredient(Scanner scanner) {
        String ingredientName;
        double weight;

        System.out.println("Enter the ingredient name: ");
        ingredientName = scanner.next();

        System.out.println("Enter the weight (in grams): ");

        try {
            weight = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Wrong weight!");
            scanner.next();
            return null;
        }

        try {
            Class[] parameters = {double.class};
            ingredientName = "Java.Collections.MainTask.SaladIngredients." + ingredientName;
            Class ingredientClass = Class.forName(ingredientName);
            Constructor constructor = ingredientClass.getDeclaredConstructor(parameters);
            Vegetable vegetable = (Vegetable) constructor.newInstance(new Object[]{new Double(weight)});

            return vegetable;
        } catch (Exception e) {
            System.out.println("No such ingredient!");
            return null;
        }
    }

    public void showIngredientsForCalories(Scanner scanner) {
        double lowerCalories, upperCalories;

        System.out.println("Enter the lower limit:");
        try {
            lowerCalories = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();
            return;
        }

        System.out.println("Enter the upper limit:");
        try {
            upperCalories = scanner.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("Wrong input!");
            scanner.next();

            return;
        }

        salad.showIngredientsByCalories(lowerCalories, upperCalories);
    }

    public void showOptions() {
        Scanner scanner = new Scanner(System.in);
        int option = -1;
        Vegetable vegetable = null;

        System.out.println("Hello! My name is " + name + ".");

        while (option != 0) {
            System.out.println("\nChoose one of the options:");
            System.out.println("1. Rename salad");
            System.out.println("2. Show recipe");
            System.out.println("3. Add ingredient");
            System.out.println("4. Sort ingredients by calories");
            System.out.println("5. Sort ingredients by weight");
            System.out.println("6. Get ingredients for calories");
            System.out.println("0. Exit");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Name your salad: ");
                    salad.setName(scanner.next());
                    break;

                case 2:
                    salad.showSaladRecipe();
                    break;

                case 3:
                    vegetable = getIngredient(scanner);
                    if (vegetable != null) {
                        if (!salad.addIngredients(vegetable)) {
                            System.out.println("Cannot add ingredient!");
                        }
                    }
                    break;

                case 4:
                    salad.sortIngredientsByCalories();
                    break;

                case 5:
                    salad.sortIngredientsByWeight();
                    break;

                case 6:
                    showIngredientsForCalories(scanner);
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    break;
            }
        }

        scanner.close();
    }
}

