package rodrigo.drink.transformer;
import rodrigo.drink.StringDrink;
import rodrigo.drink.transformer.StringTransformer;

import java.lang.StringBuilder;
import java.lang.Character;


public class StringCaseChanger implements StringTransformer {

    @Override
    public void execute(StringDrink drink) {
        StringBuilder drank = new StringBuilder(drink.getText());
        for (int i = 0; i < drank.length(); i++) {
            char n = drank.charAt(i);
            if (Character.isLowerCase(n)) {
                drank.setCharAt(i, Character.toUpperCase(n));
            }
            else if (Character.isUpperCase(n)) {
                drank.setCharAt(i, Character.toLowerCase(n));            }
        }
        drink.setText(drank.toString());
    }
}
