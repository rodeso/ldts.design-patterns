package rodrigo.bar;
import rodrigo.drink.StringDrink;
import rodrigo.drink.StringRecipe;
import rodrigo.drink.transformer.StringCaseChanger;
import rodrigo.drink.transformer.StringInverter;
import rodrigo.drink.transformer.StringReplacer;
import rodrigo.drink.transformer.StringTransformer;

import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar {

    private boolean isHappyHour = false;

    public StringBar() {
        this(new ArrayList<>());
    }

    public StringBar(List<BarObserver> observers) {
        super(observers);
    }

    @Override
    public boolean isHappyHour() {
        return isHappyHour;
    }

    @Override
    public void startHappyHour() {
        isHappyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        isHappyHour = false;
        notifyObservers();
    }
    private StringRecipe getRecipe() {
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');
        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        transformers.add(sr);
        StringRecipe recipe = new StringRecipe(transformers);
        return recipe;
    }
    public void order(StringDrink drink, StringRecipe recipe) {
        recipe.mix(drink);
    }
}