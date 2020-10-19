package io.github.valentyn.nahai.basics.variables;

/**
 * Task:
 * Define three or more code blocks in the "main" method that include each other.
 * Then include any numbers of the different variables using any primitive data types
 * in those code of blocks.
 * Finally, to see and understand mechanism of limited access to local variables,
 * it suggests you to output all the above declared variables via System.out.println()
 * in each code of block.
 * See an example below.
 */
public class ScopeOfLocalVariables {
    public static void main(String[] args) {
        {
            int intValue = 97;
            int a1 = 1;// declare more variables of any types here
            {
                int a2 = 2;// declare another variable of any type here
                // ...

                // try to output all the earlier declared variables
                System.out.println("Let's try to use 'intValue' variable.");
                System.out.println("We can do it: " + intValue);
                System.out.println("Because we are in the inner block. That's why 'intValue' is accessible");
                System.out.println("a1 " + a1);
                System.out.println("a2 " + a2);
                
                //...

                {
                    // and declare two or more variable here as well
                    char charValue = 'B';
                    //...
                    int a3 = 3;
                    int a4 = 4;

                    // try to output all the earlier declared variables
                    System.out.println("intValue: " + intValue);
                    System.out.println("charValue: " + charValue);
                    System.out.println("a1 " + a1);
                    System.out.println("a2 " + a2);
                    System.out.println("a3 " + a3);
                    System.out.println("a4 " + a4);
                    //...
                }
                // try to output all the earlier declared variables
                System.out.println("intValue: " + intValue);
                System.out.println("a1 " + a1);
                System.out.println("a2 " + a2);
                 
                // We cannot use it here. Why?  BECAUSE...
                // System.out.println("charValue: " + charValue);
//                System.out.println("a3 " + a3);
//                System.out.println("a4 " + a4);
                //...

            }
        }
        {
            // We cannot use it here. Why? BECAUSE...
            // System.out.println("intValue: " + intValue);
        }
    }
}