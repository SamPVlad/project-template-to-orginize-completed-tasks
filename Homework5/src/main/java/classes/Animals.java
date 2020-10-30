package classes;

public class Animals {
    
    private String name;
    private int age;
    public String canTalk;

    
    
    /**  constructor */

    public Animals() {}

    public Animals(String name) {
        this.name = name;
        this.age = 1;
    }

    public Animals(String name, int age, String canTalk) {
        this.name = name;
        this.age = age;
        this.canTalk = canTalk;
    }

    
    
    
    /**  getters setters  */
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("setName " + name);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setAge " + age);
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }
    }

    
    
    /**  class methods  */
    
    void animalVoice() {
        System.out.println(this.name + " Can this animal talk?");
        if(this.canTalk == "yes") {
            System.out.println(this.name + " Yes. It can talk"  + "\n");
        } else if (this.canTalk == "no"){
            System.out.println(this.name + ". Silent. It does not want to talk"  + "\n");
        } else {
            System.out.println(this.name + ". No. It can not talk" + "\n");
        }
    }
    
    void basicAnimalInfor() {
        System.out.println("name: " + this.getName());
        System.out.println("age: " + this.getAge());
    }
    
}
