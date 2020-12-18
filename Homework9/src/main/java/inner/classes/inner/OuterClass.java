package inner.classes.inner;

/**
 * Task:
 * Add more functionality in OuterClass, InnerClass classes.
 * Then, in the "main" method create several instances of InnerClass class.
 * 
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, InnerClass.
 * Затем в "main" методе создайте несколько экземпляров класса InnerClass.
 */
public class OuterClass {
    private String field1;
    
    OuterClass(String field1) {
        this.field1 = field1; 
    }// add some class members here

    @Override
    public String toString() {
        return "OuterClass{" +
            "field1='" + field1 + '\'' +
            '}';
    }

    public class InnerClass {
        InnerClass() {
            field1 = "field1 from InnerClass";
        }// add some members here
        
        public String getField1() {
            return field1;
        }
    }
    
    public static void main(String[] args) {
        
        OuterClass outerClass = new OuterClass("field1 from OuterClass");
        System.out.println(outerClass.toString());
        
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        System.out.println(outerClass.toString());
        
        System.out.println(innerClass.getField1());
    }
}
