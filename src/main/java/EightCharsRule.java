public class EightCharsRule implements Rule {
    public boolean execute(String password) {
        return password.length() >= 8;
    }
}
