import lombok.*;

@Getter
@Setter
@ToString(includeFieldNames=true)
@NoArgsConstructor
public class Car extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private final int numWheels = 4;
    @Setter(AccessLevel.NONE)
    private int speed;

    public Car(String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.speed = 0;
    }

    public void testDrive() { this.speed = 60; }

    public void park() { this.speed = 0; }
}