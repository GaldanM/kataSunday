import java.util.List;

public class PasswordChecker {

    private List<Rule> rules;

    public PasswordChecker(List<Rule> rules) {
        this.rules = rules;
    }

    public Boolean check(String password) {
        return this.rules.stream().allMatch(rule -> rule.execute(password));
    }
}
