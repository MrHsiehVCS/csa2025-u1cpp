# Unit 2 Programming Project

For this project, you will be writing a `Car` class and writing code in the `Main` class to see it in action. You will also be creating a `static` method in the `Main` class, and if you attempt the **BONUS** you will refactor your method into its own class.

## PART A - Car.java

For **Part A** you are going to complete the class `Car`. In order to do so, you will need to complete:

1. The constructor
   - The constructor takes three parameters: `anEfficiency`, `aMake`, and `aModel`.
   - You will need to use these variables to give the initial values to the instance variables of the `Car` class
   - Set the initial value of `gas` in the tank to `0`
2. The method `addGas`
   - `addGas(double amount)` takes an amount of gas from the user and adds it to the tank of this `Car`
3. The method `getGasInTank`
   - `getGasInTank()` returns the amount of gas in the tank of this `Car`
4. The method `drive`
   - `drive(double distance)` simulates driving this `Car` for a certain number of miles. This means that your method must receive the distance driven, and then must reduce the amount of gas in the tank of this `Car` based on that number and the gas efficiency of this `Car`.

## PART B - Main.java

For **PART B**, you are going to have the user interact with the `Car` you just created. To do so, in the `public static void main(String[] args)`:

1. Create a `Scanner` object. Use `System.in` to take input from the user
2. Prompt the user to give you a fuel efficiency (miles per gallon). Store this in a variable.
   - Note: Use `Double.parseDouble(sc.nextLine())` to get the efficiency.
3. Prompt the user to give you a make for the `Car`. Store this in a variable.
4. Prompt the user to give you a model for the `Car`. Store this in a variable.
5. Construct a `Car` object using the variables whose input you got from the user.
6. Ask the user for an amount of gas to enter into the tank. Remember the hint from #2. Add that much gas to the `Car`.
7. Ask the user to enter a distance to drive the car. Remember the hint from #2. Use the `drive` method to drive that far.
8. Display the make, model, and remaining gas in the tank of the `Car`. Use the accessor method from the `Car` class to do so.
9. Close the `Scanner` created in #1

### Part B Sample Run

```java
Enter a fuel efficiency: 30
Enter a make: Honda
Enter a model: Fit
Enter amount of gas to add: 10
Enter distance to drive: 160
Your Honda Fit currently has 4.666666666666667 gallons of gas left in the tank
```

## PART C

For **PART C**, you will be adding to the `Main` class a new method called `wordChanger`. The `wordChanger` method should take 6 parameters, should be `static` and should return a `String`. The parameters should be:

1. `String word1`
2. `int start1`
3. `int end1`
4. `String word2`
5. `int start2`
6. `int end2`

`wordChanger` takes the pieces of two words and creates a new word by combining those pieces together. The start and end variables tell you the indices where to start and end the piece of the word in the `String`, inclusive.

### Part C Sample Run

```java
String str1 = "Brian";
String str2 = "Wade";
String str3 = wordChanger(str1, 2, 3, str2, 0, 2);
System.out.println(str3); //Will print out iaWad
```

## PART D - BONUS

Rework `wordChanger` so that it is a method in its ow class called WordChanger. Allow it to still be called as a `static` method.

## Grading Breakdown

- Code compiles & runs without errors: 1 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- No public methods/attributes besides the ones specified: 2 point
- All code is DRY (Don't repeat yourself): 3 points
- Passes all test cases: 20 points

*Total: 30 points*
