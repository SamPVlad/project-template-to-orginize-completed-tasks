package io.github.valentyn.nahai.basics.variables;

/*
 * Task:
 * Uncomment code and fix compiler issues. Figure out the causes of failures.
 * Hint: IDE usually provides a description of compiler issues.
 */
public class IncorrectVariableDeclaration {
    /*// 1.
    int i;
    i = 0;

    // 2.
    char c = 'ab';
    System.out.println(c);
    
    // 3. 
    int a = 3.2;
    
    // 4.
    float f = 2.1;
    
    // 5.
    String s = 'This is a string';
    
    // 6.
    long bigLongValue = 964238764145245237L;
    int bigInt = bigLongValue;
    
    // 7.
    boolean isVariableAssignedInRightWay = "true";*/

    public static void main(String[] args) {
        // 1.
        int i = 0;
        System.out.println(i);

        // 2.
        char c = 'a';
        System.out.println(c);

        // 3. 
        double a = 3.2;
        System.out.println(c);

        // 4.
        float f = 2.1f;
        System.out.println(f);

        // 5.
        String s = "This is a string";
        System.out.println(s);

        // 6.
        long bigLongValue = 964238764145245237L;
        long bigInt = bigLongValue;

        // 7.
        boolean isVariableAssignedInRightWay = true;
        System.out.println(s);
    }
}