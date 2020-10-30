package classes;

/**
 * Task:
 * Create several classes that represent entities of the real world.
 * Each class has to contain fields (data described the state of an object), methods (actions needed to operate those data).
 * Another requirements are to provide at least 3 different constructors, one of them should be "default" one.
 * Also, create a runner class which will be a container with "main" method needed to run the program, instantiate objects an so on. 
 *
 * Создайте несколько классов, которые представляют сущности реального мира.
 * Каждый класс должен содержать поля (данные описывают состояние объекта), методы (действия, необходимые для работы с этими данными).
 * Еще одно требование - предоставить как минимум 3 разных конструктора, один из которых должен быть "по умолчанию".
 * Кроме того, создайте runner класс, который будет контейнером с "main" методом, необходимым для запуска программы, создания экземпляров объектов и так далее.
 */




public class BasicClass {
    public static void main(String[] args) {

        /**  create an object from class Cars, which is extended from class Animal */
        
        Cats cat1 = new Cats();
        cat1.basicAnimalInfor();
        cat1.setName("Cat1");
        cat1.setAge(-2);
        cat1.basicAnimalInfor();
        
        Cats cat2 = new Cats("Cat2", 2, "yes", "Cats");
        cat1.basicAnimalInfor();
        cat1.animalVoice();
        cat2.animalVoice();

        
        
        
        /**  create an object from class Dads, which is not extended from any class */
        
        Dogs dog3 = new Dogs();
        dog3.basicDogsInfor();
        dog3.setName("Dog3");
        dog3.setAge(-10);
        dog3.basicDogsInfor();


        Dogs dog4 = new Dogs("Dog4", -99, "red", "no");
        dog4.basicDogsInfor();
        dog3.dogVoice();
        dog4.dogVoice();
        
    
    }
}