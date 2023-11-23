package rodrigo.bar.client;

import rodrigo.bar.Bar;
import rodrigo.drink.StringDrink;
import rodrigo.drink.StringRecipe;
import rodrigo.bar.BarObserver;
import rodrigo.bar.StringBar;

public interface Client extends BarObserver {
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar);

    void happyHourEnded(Bar bar);
}
