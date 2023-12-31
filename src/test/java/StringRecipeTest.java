package rodrigo;

import org.junit.jupiter.api.Test;
import rodrigo.drink.StringDrink;
import rodrigo.drink.StringRecipe;
import rodrigo.drink.transformer.StringCaseChanger;
import rodrigo.drink.transformer.StringInverter;
import rodrigo.drink.transformer.StringReplacer;
import rodrigo.drink.transformer.StringTransformer;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringRecipeTest {
    @Test
    public void stringRecipe() {
        StringDrink drink = new StringDrink("AbCd-aBcD");
        StringInverter si = new StringInverter();
        StringCaseChanger cc = new StringCaseChanger();
        StringReplacer sr = new StringReplacer('A', 'X');
        List<StringTransformer> transformers = new ArrayList<>();
        transformers.add(si);
        transformers.add(cc);
        transformers.add(sr);
        StringRecipe recipe = new StringRecipe(transformers);
        recipe.mix(drink);
        assertEquals("dCbX-DcBa", drink.getText());
    }
}
