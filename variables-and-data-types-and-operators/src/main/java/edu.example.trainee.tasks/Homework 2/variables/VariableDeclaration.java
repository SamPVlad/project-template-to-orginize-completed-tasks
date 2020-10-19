package io.github.valentyn.nahai.basics.variables;

/*
 * Task:
 * Declare all the possible primitive data-type variables, assign some values and output them.
 */
public class VariableDeclaration {
    public static void main(String[] args) {
        byte byteValue = 100;
        short shortValue = 30549;
        
        // ...
        char charValue = 'a';
        long longValue = 2232322L;
        float floatValue = 1.23f;
        double doubleValue = 2.24d;
        boolean booleanValue = true;
        int intValue = 33;
            // Your code here

        System.out.println("A \"byte\" type variable: " + byteValue);
        System.out.println("A \"short\" type variable: " + shortValue);
        
        // ...
        // Your code here
        System.out.println("A \"char\" type variable: " + charValue);
        System.out.println("A \"long\" type variable: " + longValue);
        System.out.println("A \"float\" type variable: " + floatValue);
        System.out.println("A \"double\" type variable: " + doubleValue);
        System.out.println("A \"boolean\" type variable: " + booleanValue);
        System.out.println("A \"int\" type variable: " + intValue);
    }
}