package uoft.csc207.javaexamples;

import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Examples of Java constructs.
 */
public class JavaExamples {

    /**
     * Demonstrate Java: if statements, while loops, arrays, and so on.
     *
     * @param input
     * @return the result.
     */
    public String doJavaExamples(String input) {
        String result = null;
        switch (input) {
            case MainActivity.WHILE_EXAMPLE:
                result = doSumWhileLoop();
                break;
            case MainActivity.FOR_EXAMPLE:
                result = doSumForLoop();
                break;
            case MainActivity.ARRAY_EXAMPLE:
                result = doStringArrayExample();
                break;
            case MainActivity.OBJECT_EXAMPLE:
                result = doObjectExample();
                break;
            default:
                result = "Unexpected input";
        }
        return result;
    }

    /**
     * Create a Person and return the toString value.
     * @return the printable representation of the Person.
     */
    private String doObjectExample() {
        String name = "Justin Pierre James Trudeau";
        Person primeMinister = new Person("trudeauj", name.split(" "));
        return primeMinister.toString();
    }

    /**
     * Sum the numbers 1 through 10 using a while loop and return a sentence containing the result.
     *
     * @return a sentence containing the sum of 1 through 10.
     */
    private String doSumWhileLoop() {
        int i = 0;
        int sum = 0;
        while (i != 10) {
            i = i + 1;
            sum = sum + i;
        }
        return "While: sum of 1 through 10 is " + sum;
    }

    /**
     * Sum the numbers 1 through 10 using a for loop and return a sentence containing the result.
     *
     * @return a sentence containing the sum of 1 through 10.
     */
    private String doSumForLoop() {
        int sum = 0;
        for (int i = 1; i != 11; i++) {
            sum = sum + i;
        }

        return "For: sum of 1 through 10 is " + sum;
    }

    /**
     * Create a String array and manipulate it.
     *
     * @return
     */
    private String doStringArrayExample() {
        String karen = "Karen";
        String mike = "Mike";
        String paul = "Paul";
        String[] myStrings;
        myStrings = new String[]{karen, mike, paul, "Moogah"};

        // What does this do?
        myStrings[0] = myStrings[1];
        myStrings[1] = myStrings[2];
        myStrings[2] = myStrings[0];

        return Arrays.toString(myStrings);
    }
}
