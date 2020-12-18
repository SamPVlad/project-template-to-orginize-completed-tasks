package inner.classes.nested;

/**
 * Task:
 * Add more functionality in OuterClass, NestedClass classes.
 * Try to use non-static fields of OuterClass class in NestedClass class.
 * Also, try to use static fields of Outer class in NestedClass class.
 * Then, in the "main" method create several instances of NestedClass class.
 *
 * Задание:
 * Добавьте больше функциональности в классы OuterClass, NestedClass.
 * Попробуйте использовать нестатические поля класса OuterClass в классе NestedClass.
 * Также попробуйте использовать статические поля OuterClass класса в классе NestedClass.
 * Затем в "main" методе создайте несколько экземпляров класса NestedClass.
 */
public class OuterClass {
    private String field1;
    public static String staticField1 = "sf1";
    // add some class members here


    public OuterClass(String field1) {
        this.field1 = field1;
    }

    public String getField1() {
        System.out.println("getField1 " + field1);
        return field1;
    }

    public static String getStaticField1() {
        return staticField1;
    }

    static class InnerClass {
        private String field2;
        public static String staticField2 = "st2";

        public InnerClass(String field2) {
            this.field2 = field2;
        }

        public String getField2() {
            System.out.println("getField2" + field2);
            return field2;
        }

        public String getStaticField2() {
            System.out.println("getStaticField2 " + staticField2);
            return staticField2;
        }
        
        public static String getSumOfSaticFields() {
            System.out.println("getSumOfSaticFields " + staticField2 + getStaticField1());
            return staticField2 + getStaticField1();
        }
    }

    public static void main(String[] args) {
        OuterClass outerClass1 = new OuterClass("f1");
        outerClass1.getField1();

        //String innerClass2 = InnerClass.getSumOfSaticFields();
        
        OuterClass.InnerClass innerClass1 = new OuterClass.InnerClass("f2");
        innerClass1.getField2();

        OuterClass.InnerClass.getSumOfSaticFields();
    }
}


