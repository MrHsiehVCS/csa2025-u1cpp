package u1cpp;

/**
 * YOUR COMMENT HERE (describe the main idea/purpose of the class in 1-2 sentences)
 */
public class Dice {
    private int currentSide;

    /**
     * creates a 6 sided die. 
     * By default, dice all start with a value of 1. 
     */
    public Dice() {
        currentSide = 1;
    }

    /**
     * YOUR COMMENT HERE
     */
    public Dice(int startingSide) {
        // YOUR CODE HERE
    }

    /**
     * YOUR COMMENT HERE
     */
    public void roll () {
        // your code here

    }

    /**
     * YOUR COMMENT HERE
     * @return integer value of the dice
     */
    public int getValue() {
        // Your code here (delete the started code below)
        return 0;
    }

    public static int getDifference(Dice dice1, Dice dice2) {
        // YOUR CODE HERE (remove the dummy code below)
        // hint: use getValue of the two parameters, along with abs. 
        return -1;
    }
}