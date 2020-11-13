package inner.classes.local;

/**
 * Task:
 * Define a local class in the "getSumOfTwoNumbers" method.
 * Add some functionality in the newly created local class as it is described below in the comments.
 * Create an instance of it, invoke a method on a created object to get a sum.
 * In the "main" method, create an object of LocalClass and invoke the "getSumOfTwoNumbers" method to demonstrate using local classes in practice.
 * 
 * Задача:
 * Определите локальный класс в методе getSumOfTwoNumbers.
 * Добавьте некоторые функции во вновь созданный локальный класс, как это описано ниже в комментариях.
 * Создайте его экземпляр, вызовите метод для созданного объекта, чтобы получить сумму.
 * В "main" методе создайте объект LocalClass и вызовите метод «getSumOfTwoNumbers», чтобы продемонстрировать использование локальных классов на практике.
 */
public class LocalClass {
    private double firstNumber;

    LocalClass (double firstNumber) {
        this.firstNumber = firstNumber;
    }
    
    public double getSumOfTwoNumbers(int secondNumber) {
        
        class SumOfTwoNumbers {
            
            public double getSum() {
                return secondNumber + firstNumber;
            }
        }

        SumOfTwoNumbers sumOfTwoNumbers = new SumOfTwoNumbers();
        
        return sumOfTwoNumbers.getSum();
    }

    public static void main(String[] args) {
        LocalClass localClass = new LocalClass(2);
        System.out.println(localClass.getSumOfTwoNumbers(2));// your code here
    }
}
