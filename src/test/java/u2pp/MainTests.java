package u2pp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.github.stefanbirkner.systemlambda.SystemLambda.tapSystemOut;
import static com.github.stefanbirkner.systemlambda.SystemLambda.withTextFromSystemIn;

/**
 * Unit Tests for Unit 2 Programming Project
 */
public class MainTests {
    @Test
    void partB_whenMainMethodIsCalledWithUserInputs_promptsAndOutputsCorrectly() throws Exception{
        String expectedText = "Enter a fuel efficiency: Enter a make: Enter a model: Enter amount of gas to add: Enter distance to drive: Your Toyota Corolla currently has 49.5 gallons of gas left in the tank";
        String studentText = tapSystemOut(() -> {
            withTextFromSystemIn("100", "Toyota", "Corolla", "50", "50").execute(() -> Main.main(null));
        }).trim();

        assertEquals(expectedText, studentText);
    }

    @Test
    void partC_whenWordChangerIsCalledWithAllOfStr1AndPartOfStr2_ReturnsACorrectlyContactenatedString() {

        int start = 1, end = 3;
        String str1 = "This is a test String", str2 = "This is another test String", expectedString = str1 + str2.substring(start, end + 1);

        assertEquals(expectedString, Main.wordChanger(str1, 0, str1.length() - 1, str2, start, end));
    }

    @Test
    void partC_whenWordChangerIsCalledWithAllOfStr2AndPartOfStr1_ReturnsACorrectlyContactenatedString() {

        int start = 1, end = 3;
        String str1 = "This is a test String", str2 = "This is another test String", expectedString = str1.substring(start, end + 1) + str2;

        assertEquals(expectedString, Main.wordChanger(str1, start, end, str2, 0, str2.length() - 1));
    }

    @Test
    void partC_whenWordChangerIsCalledWithPartOfStr1AndPartOfStr2_ReturnsACorrectlyContactenatedString() {

        int start1 = 2, end1 = 3, start2 = 6, end2 = 8;
        String str1 = "This is a test String", str2 = "This is another test String", expectedString = str1.substring(start1, end1 + 1) + str2.substring(start2, end2 + 1);

        assertEquals(expectedString, Main.wordChanger(str1, start1, end1, str2, start2, end2));
    }
}
