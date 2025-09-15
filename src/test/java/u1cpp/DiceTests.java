package u1cpp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DiceTests {

    @Test
    public void getValue_returnsCorrectValue() {
        Dice d = new Dice();
        assertEquals(1, d.getValue());
    }

    @Test
    public void parameterizedConstructor_setsCorrectValue() {
        Dice d2 = new Dice(2);
        assertEquals(2, d2.getValue());

        Dice d3 = new Dice(3);
        assertEquals(3, d3.getValue());

        Dice d4 = new Dice(4);
        assertEquals(4, d4.getValue());

        Dice d5 = new Dice(5);
        assertEquals(5, d5.getValue());

        Dice d6 = new Dice(6);
        assertEquals(6, d6.getValue());
    }

    @Test
    public void roll_isRandom() {
        Dice d = new Dice();
        int numTrialsRandom = 0;
        for(int i = 0; i < 100; i++) {
            int[] rollCounts = {0,0,0,0,0,0};
            for(int j = 0; j < 1200; j++) {
                d.roll();
                assertTrue(d.getValue() > 0 && d.getValue() < 7);
                rollCounts[d.getValue()-1]++; 
            }
            boolean allValuesEqualish = true;
            for(int j = 0; j < rollCounts.length; j++) {
                if (rollCounts[j] < 150) {
                    allValuesEqualish = false;
                }
            }

            if (allValuesEqualish) {
                numTrialsRandom++;
            }
        }

        assertTrue(numTrialsRandom >= 99);
        System.out.println(numTrialsRandom);
    }

    @Test
    public void getDifference_correctValues() {
        Dice d1 = new Dice(1);
        Dice d2 = new Dice(2);
        Dice d3 = new Dice(3);
        Dice d4 = new Dice(4);
        Dice d5 = new Dice(5);
        Dice d6 = new Dice(6);

        assertEquals(2, Dice.getDifference(d4, d6));
        assertEquals(2, Dice.getDifference(d6, d4));
        assertEquals(3, Dice.getDifference(d2, d5));
        assertEquals(1, Dice.getDifference(d4, d3));
        assertEquals(5, Dice.getDifference(d1, d6));
        assertEquals(4, Dice.getDifference(d5, d1));
    }

    
}
