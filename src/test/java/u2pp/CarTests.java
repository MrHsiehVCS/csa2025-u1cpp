package u2pp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTests {

    private Car c;
    private static final double STARTING_GAS = 0, MPG = 25.5, EPSILON = .001;
    private static final String MAKE = "Kia", MODEL = "Rio";

    @BeforeEach
    public void setup() {
        c = new Car(MPG, MAKE, MODEL);
    }

    @Test
    public void getGasInTank_WhenCalled_ShouldReturnTheAmountOfGasCurrentlyInTheTank() {
        assertEquals(STARTING_GAS, c.getGasInTank());
    }

    @Test
    public void addGas_WhenCalledWithPostiveValue_ShouldAddThatMuchGasToTank() {
        double gasToAdd = 40.2;
        c.addGas(gasToAdd);
        assertEquals(STARTING_GAS + gasToAdd, c.getGasInTank(), EPSILON);
    }

    @Test
    public void addGas_WhenCalledWithPostiveValue_ShouldSubtractThatMuchGasToTank() {
        double gasToAdd = -40.2;
        c.addGas(gasToAdd);
        assertEquals(STARTING_GAS + gasToAdd, c.getGasInTank(), EPSILON);
    }

    @Test
    public void getMakeMakeAndModel_WhenCalled_ShouldReturnConcatenateMakeSpaceModel() {
        String expectedString = MAKE + " " + MODEL;
        assertEquals(expectedString, c.getMakeAndModel());
    }

    @Test
    public void getMpg_WhenCalled_ShouldReturnTheEfficiency() {
        assertEquals(MPG, c.getMpg(), EPSILON);
    }

    @Test
    public void drive_WhenCalled_ShouldCorrectlyUpdateTheGasInTank() {
        double distance = 40;
        c.drive(distance);
        assertEquals(-distance/MPG, c.getGasInTank(), EPSILON);
    }
}
