//Question 5 (Advanced): Will the following statement give any error in Java?

package com.gopal.assignments._01_assignment;

public class _05_IdentifierCheck {
    public static void main(String[] args) {

        int $ = 24;

        System.out.println($);

        System.out.println("No, the statement int $ = 24; will not give an error because $ is a valid Java identifier. \n" +
                "However, using $ as a variable name is not recommended because it is often used by the Java compiler \n" +
                "and some frameworks for internally generated names, which can make the code confusing and harder to read.");
    }
}
