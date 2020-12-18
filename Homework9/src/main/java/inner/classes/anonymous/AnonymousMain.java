package inner.classes.anonymous;

/**
 * Task:
 * Define and create 2 anonymous classes in the "main" method
 * by extending and implementing Utensil class, FoodCollector interface respectively.
 * 
 * Задание:
 * Определите и создайте 2 анонимных класса в "main" методе
 * путем расширения и реализации класса Utensil и интерфейса FoodCollector соответственно.
 */
public class AnonymousMain {

    public static FoodCollector getFoodCollector(){
        return new FoodCollector() {

            @Override
            public void collectFood() {
                System.out.println("AnonymousClassFoodCollector");
            }
        };
    }
    
    public static void main(String[] args) {

        FoodCollector foodCollector = getFoodCollector();
        foodCollector.collectFood();
        
        Utensil utensil = new Utensil("fork", "It helps to eat food") {
            @Override
            public void use() {
                System.out.println("AnonymousClassUtensil");
            }
        };

        utensil.use();
}
}
