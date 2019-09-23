package uoft.csc207.javaexamples.examples;

import uoft.csc207.javaexamples.Person;

public class ObjectExample implements JavaExamples {
    @Override
    public String doExample() {
        return this.doObjectExample();
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
}
