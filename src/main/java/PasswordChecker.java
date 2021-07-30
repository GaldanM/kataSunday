import java.util.function.Function;

public class PasswordChecker {
    private Function<String, Boolean> rule;

    public PasswordChecker(Function<String, Boolean> rule) {
        this.rule = rule;
    }

    public Boolean check(String password) {
        return this.rule.apply(password);
    }
}
