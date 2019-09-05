package uoft.csc207.javaexamples;

import java.util.Arrays;

/**
 * A person at the UofT with a name and a UTORid.
 */
public class Person {

    /**
     * The person's name, with the last name last.
     */
    private String[] name;

    /**
     * The person's UTORid.
     */
    private String id;

    /**
     * Create a new person with UTORid id and name n.
     *
     * @param id the UTORid
     * @param n  the name, with the last index containing the last name.
     */
    public Person(String id, String[] n) {
        this.id = id;
        this.name = n;
    }

    /**
     * Return this Person's UTORid.
     *
     * @return the Person's UTORid.
     */
    public String getId() {
        return id;
    }

    /**
     * Return this Person's name.
     *
     * @return this Person's name.
     */
    public String[] getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + formatName() +
                ", id='" + id + '\'' +
                '}';
    }

    /**
     * Assemble the person's name: last name, then 2 spaces, then the first and other names.
     *
     * @return the person's name, formatted.
     */
    private String formatName() {
        String formattedName = name[name.length - 1] + ",";
        for (int i = 0; i != name.length - 1; i++) {
            formattedName = formattedName + " " + name[i];
        }

        return formattedName;
    }
}