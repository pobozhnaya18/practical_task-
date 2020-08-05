package Collections.MainTask.Salads;

import Collections.MainTask.SalatIngredients.*;

public class FreshSalad extends Salad{

    public FreshSalad() {
        setName("Fresh salad");

        addIngredients(new Cabbage(500));
        addIngredients(new Cucumber(150));
        addIngredients(new Corn(340));
        addIngredients(new Dill(50));
    }
}

