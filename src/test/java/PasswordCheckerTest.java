import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordCheckerTest {
    @Test
    void shouldAcceptEightChars() {
        assertThat(new PasswordChecker().check("12345678")).isTrue();
    }

    @Test
    void shouldRejectSevenChars() {
        assertThat(new PasswordChecker().check("1234567")).isFalse();
    }
}


