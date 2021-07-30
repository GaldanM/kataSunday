public class PasswordChecker {
    public boolean check(String password) {
        if (password.length() > 8) return true;
        return false;
    }
}
