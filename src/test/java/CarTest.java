import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    Car car;

    @BeforeEach
    public void setup() {
        car = new Car();
    }
    @Test
    @DisplayName("This test helps to check is object car Vehicle.")
    public void testInstanceOfCar() {
        assertThat(car instanceof Vehicle);
    }

    @Test
    @DisplayName("Check amount of car's wheels.")
    public void testAmountOfCarsWheels() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    @DisplayName("Check car's speed.")
    public void testCarSpeed() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    @DisplayName("Check parking")
    public void testParking() {
        car.testDrive();
        assertThat(car.getSpeed()).isPositive();
        car.park();
        assertThat(car.getSpeed()).isZero();
    }

    @AfterEach
    public void cleanup() {
        car = null;
    }
}
