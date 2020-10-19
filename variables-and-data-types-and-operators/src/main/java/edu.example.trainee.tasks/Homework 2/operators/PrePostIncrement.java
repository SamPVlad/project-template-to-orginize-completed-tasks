package io.github.valentyn.nahai.basics.operators;

/**
 * Task:
 * In the following program, explain why the value "6" is printed twice in a row.
 * Put the explanation in comments.
 */
public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 10;
        i++;
        System.out.println(i);    // "11"
        ++i;
        System.out.println(i);    // "12"
        System.out.println(++i);  // "13"
        System.out.println(i++);  // "13"
        System.out.println(i);    // "14"
        
        /* 
        * Increment and decrement operators can be placed before (prefix) 
        * or after (postfix) the variable they apply to. 
        * If you place an increment or decrement operator 
        * before its variable, the operator is applied before 
        * the rest of the expression is evaluated. 
        * If you place the operator after the variable, the operator 
        * is applied after the expression is evaluated.
        * */
    }
}
