package rodrigo;

public class StringReplacer implements StringTransformer{
    private char targetChar;
    private char replacementChar;

    public StringReplacer(char targetChar, char replacementChar) {
        this.targetChar = targetChar;
        this.replacementChar = replacementChar;
    }
    @Override
    public void execute(StringDrink drink) {
        // Using String.replace(char, char) to replace occurrences of targetChar with replacementChar
        drink.setText(drink.getText().replace(targetChar, replacementChar));
    }
}
