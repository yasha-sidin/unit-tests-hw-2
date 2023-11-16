import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MotorcycleTest {
    Motorcycle motorcycle;

    @BeforeEach
    public void setup() {
        motorcycle = new Motorcycle();
    }

    @Test
    @DisplayName("Check amount of motorcycle's wheels.")
    public void testAmountOfMotorcycleWheels() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    @DisplayName("Check motorcycle's speed.")
    public void testCarSpeed() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    @DisplayName("Check parking")
    public void testParking() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isNotZero().isPositive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isZero();
    }

    @AfterEach
    public void cleanup() {
        motorcycle = null;
    }
}
