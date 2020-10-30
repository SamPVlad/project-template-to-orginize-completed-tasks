package classes;

public class Dogs {
    
    String name;
    int age;
    String color;
    String dogTalk;

  
    
    /**  constructor */  
    
    public Dogs() {}

    public Dogs(String name) {
        this.name = name;
        this.age = 2;
    }   

    public Dogs(String name, int age, String color, String dogTalk) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.dogTalk = dogTalk;
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

    public String getColor() {
        return color;
    }



    
    
    /**  class methods  */
    
    void dogVoice() {
        System.out.println(this.name +  " Can this animal talk?");
        if(this.dogTalk == "yes") {
            System.out.println(this.name + " Yes. It can talk"  + "\n");
        } else if (this.dogTalk == "no"){
            System.out.println(this.name + ". Silent. It does not want to talk"  + "\n");
        } else {
            System.out.println(this.name + ". No. It can not talk" + "\n");
        }
}
    void basicDogsInfor() {
        System.out.println("name: " + this.getName());
        System.out.println("age: " + this.getAge());
        System.out.println("color: " + this.getColor());
    }


}
