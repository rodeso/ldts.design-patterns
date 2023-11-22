package rodrigo;
import java.lang.StringBuilder;

public class StringInverter implements StringTransformer{

    @Override
    public void execute(StringDrink drink) {
        StringBuilder drank = new StringBuilder(drink.getText());
        drank.reverse();
        drink.setText(drank.toString());
    }
}
