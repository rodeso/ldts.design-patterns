package rodrigo.bar.strategy;

import rodrigo.bar.StringBar;
import rodrigo.drink.StringDrink;
import rodrigo.drink.StringRecipe;

public class ImpatientStrategy implements OrderingStrategy{
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        bar.order(drink, recipe);
    }

    @Override
    public void happyHourStarted(StringBar bar) {
    }

    @Override
    public void happyHourEnded(StringBar bar) {
    }
}

