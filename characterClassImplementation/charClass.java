public class CharacterExample {

    /* Reminder that the main class is where our java app starts.
    we also name our class based on the concept, in this case "character 
    example" demonstrates our implementation of the character class */

    private char value;

    public CharacterExample(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
    }

    /* This class method returns a boolean true or false
    value on if a character is a letter */
    public boolean isLetter() {
        return Character.isLetter(value);
    }

    public boolean isDigit() {
        return Character.isDigit(value);
    }

    public boolean isWhitespace() {
        return Character.isWhitespace(value);
    }

    public static void main(String[] args) {
        CharacterExample customChar = new CustomCharacter('a');
        
        System.out.println("Character: " + customChar.getValue());
        System.out.println("Is Digit: " + customChar.isDigit());
        System.out.println("Is Letter: " + customChar.isLetter());
        System.out.println("Uppercase: " + customChar.toUpperCase());
        System.out.println("Lowercase: " + customChar.toLowerCase());
        
        customChar.setValue('1');
        System.out.println("New Character: " + customChar.getValue());
        System.out.println("Is Digit: " + customChar.isDigit());
    }
}

}