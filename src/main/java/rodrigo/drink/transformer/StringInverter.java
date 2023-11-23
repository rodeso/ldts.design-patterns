package rodrigo.drink.transformer;
import rodrigo.drink.StringDrink;
import rodrigo.drink.transformer.StringTransformer;

import java.lang.StringBuilder;

public class StringInverter implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuilder drank = new StringBuilder(drink.getText());
        drank.reverse();
        drink.setText(drank.toString());
    }
}
