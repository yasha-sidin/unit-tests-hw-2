import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString(includeFieldNames=true)
public class Motorcycle extends Vehicle {
    private String company;
    private String model;
    private int yearRelease;
    private final int numWheels = 2;
    @Setter(AccessLevel.NONE)
    private int speed;

    public Motorcycle (String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.speed = 0;
    }

    public void testDrive() { this.speed = 75; }

    public void park() { this.speed = 0; }
}