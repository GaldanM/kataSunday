import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordCheckerTest {
    @Test
    void shouldAcceptEightChars() {
        assertThat(new PasswordChecker(List.of(new EightCharsRule())).check("12345678")).isTrue();
    }

    @Test
    void shouldRejectSevenChars() {
        assertThat(new PasswordChecker(List.of(new EightCharsRule())).check("1234567")).isFalse();
    }
}


