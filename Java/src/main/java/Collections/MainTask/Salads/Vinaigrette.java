package Collections.MainTask.Salads;

import Collections.MainTask.SalatIngredients.*;

public class Vinaigrette extends Salad{

    public Vinaigrette() {
        setName("Vinaigrette");

        addIngredients(new Potato(400));
        addIngredients(new Carrot(300));
        addIngredients(new Beta(400));
        addIngredients(new Cucumber(200));
        addIngredients(new Cabbage(200));
    }
}

