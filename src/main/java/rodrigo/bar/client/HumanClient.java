package rodrigo.bar.client;

import rodrigo.bar.Bar;
import rodrigo.bar.StringBar;
import rodrigo.bar.strategy.OrderingStrategy;
import rodrigo.drink.StringDrink;
import rodrigo.drink.StringRecipe;

public class HumanClient implements Client{
    private OrderingStrategy strategy;

    public HumanClient(OrderingStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public void happyHourStarted(Bar bar) {
        if (bar instanceof StringBar)
            strategy.happyHourStarted((StringBar) bar);
    }

    @Override
    public void happyHourEnded(Bar bar) {
        if (bar instanceof StringBar) {
            strategy.happyHourStarted((StringBar) bar);
        }
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        strategy.wants(drink, recipe, bar);
    }

}
