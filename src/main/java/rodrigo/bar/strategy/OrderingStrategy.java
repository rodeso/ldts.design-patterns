package rodrigo.bar.strategy;

import rodrigo.bar.StringBar;
import rodrigo.drink.StringDrink;
import rodrigo.drink.StringRecipe;

public interface OrderingStrategy {
    void wants(StringDrink drink, StringRecipe recipe, StringBar bar);
    void happyHourStarted(StringBar bar);
    void happyHourEnded(StringBar bar);
}
