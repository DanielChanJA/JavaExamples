package uoft.csc207.javaexamples.examples;

import java.util.Arrays;

public class StringArrayExample implements JavaExamples {
    @Override
    public String doExample() {
        return this.doStringArrayExample();
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
