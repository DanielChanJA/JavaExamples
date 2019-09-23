package uoft.csc207.javaexamples.examples;

public class WhileExample implements JavaExamples {

    @Override
    public String doExample() {
        return this.doSumWhileLoop();
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
}
