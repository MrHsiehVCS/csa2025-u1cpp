# Unit 1c Programming Project

For this project, you will be writing a `Dice` class, a `Car` class. You will then use the `Car` class in a main method. You will also be creating a `static` method in the `Main` class that uses `String` methods.

## Part A - Dice.java

**hint**: test your code after each part!

1. `getValue` 
  - it should return the value stored in the attribute `currentValue`. 
  - should only take 1 line of code. 
2. The parameterized constructor
  - should set the attribute `currentValue` to the parameter. 
3. `roll()`
  - should set `currentValue` to a random value between 1 and 6 (inclusive)
  - use `Math.random()`
4. `getDifference()`
  - this is a `static` method (aka a class method)
  - it should compare the values of the two `Dice` given in the parameters, and return their difference
  - make sure the value returned is positive (use `Math.abs`)


## PART B - Car.java

For **Part B** you are going to complete the class `Car`. In order to do so, you will need to complete:

1. The constructor
   - The constructor has three parameters: `anEfficiency`, `aMake`, and `aModel`.
   - You will need to use these variables to give the initial values to the instance variables of the `Car` class
   - Set the initial value of `gas` in the tank to `0`
2. The method `addGas`
   - `addGas(double amount)` takes an amount of gas from the user and adds it to the tank of this `Car`
3. The method `getGasInTank`
   - `getGasInTank()` returns the amount of gas in the tank of this `Car`
4. The method `drive`
   - `drive(double distance)` simulates driving this `Car` for a certain number of miles. This means that your method must receive the distance driven, and then must reduce the amount of gas in the tank of this `Car` based on that number and the gas efficiency of this `Car`.
   - use common sense on how to calculate how much gas to subtract (hint: efficiency is in miles per gallon)

## PART C - Main.java

For **PART C**, you are going to have the user interact with the `Car` you just created. To do so, in the `public static void main(String[] args)`:

1. Create a `Scanner` object. Use `System.in` to take input from the user
2. Prompt the user to give you a make for the `Car`. Store this in a variable.
3. Prompt the user to give you a model for the `Car`. Store this in a variable.
4. Prompt the user to give you a fuel efficiency (miles per gallon). Store this in a variable.
   - Note: Use `Double.parseDouble(sc.nextLine())` to get the efficiency.
   - if you don't know how to use this, google it, looking for examples.
5. Construct a `Car` object using the variables whose input you got from the user.
6. Ask the user for an amount of gas to enter into the tank (use hint from #4). Add that much gas to the `Car`.
7. Ask the user to enter a distance to drive the car. Use the `drive` method to drive that far.
8. Display the make, model, and remaining gas in the tank of the `Car`. Use the accessor method from the `Car` class to do so.
9. Close the `Scanner` created in #1

### Part C Sample Run

```java
Enter a make: Honda
Enter a model: Fit
Enter a fuel efficiency: 30
Enter amount of gas to add: 10
Enter distance to drive: 160
Your Honda Fit currently has 4.666666666666667 gallons of gas left in the tank
```

## PART D

For **PART D**, you will be adding to the `Main` class a new method called `wordChanger`. The `wordChanger` method should take 6 parameters, should be `static` and should return a `String`. The parameters should be:

1. `String word1`
2. `int start1`
3. `int end1`
4. `String word2`
5. `int start2`
6. `int end2`

`wordChanger` takes the pieces of two words and creates a new word by combining those pieces together. The start and end variables tell you the indices where to start and end the piece of the word in the `String`, inclusive.

For this question, I recommend breaking it into smaller parts, and doing one small step at a time, testing your code at each step. 

To informally test your code, you can run the `wordChanger` method in main, with some test arguments. Then, just run the code, and any `System.out.println` calls in the method will produce output. Create some `println` statements to print out your intermediate steps. 

### Part C Sample Run

```java
String str1 = "Brian";
String str2 = "Wade";
String str3 = wordChanger(str1, 2, 3, str2, 0, 2);
System.out.println(str3); //Will print out iaWad
```

## Grading Breakdown

- Code compiles & runs without errors: 2 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- No public methods/attributes besides the ones specified: 2 point
- All code is DRY (Don't repeat yourself): 2 points
- Passes all test cases: 13 points (1 pt each test)

*Total: 23 points*
