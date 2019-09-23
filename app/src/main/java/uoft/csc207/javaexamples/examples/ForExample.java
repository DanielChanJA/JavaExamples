package uoft.csc207.javaexamples.examples;

public class ForExample implements JavaExamples {

    @Override
    public String doExample() {
        return this.doSumForLoop();
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
}
