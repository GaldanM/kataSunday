import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PasswordCheckerTest {
    @Test
    void shouldAcceptLongerThanEightChars() {
        assertThat(new PasswordChecker().check("abcdefhij")).isTrue();
    }



}


