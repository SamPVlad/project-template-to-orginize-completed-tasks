package inheritance;

import inheritance.people.Person;
import inheritance.people.Professor;
import inheritance.people.Student;
import inheritance.people.Stuff;

/**
 * Task:
 * There are a base Person class and subclasses (the Professor, Student classes).
 * You have to do the following:
 *   1. Complete Professor, Student classes by implementing abstract method work();
 *   2. Add getters and setters in each class;
 *   3. Add some specific methods to expand subclasses with new behavioral;
 *   4. Follow the principals of encapsulations;
 *   5. Create at least 3 new classes that inherit already provided ones and perform 4 points decribed in the above;
 * The classes to complete the task are in io.github.valentyn.nahai.oop.inheritance.people package.
 * 
 * Задача:
 * Есть базовый класс Person и подклассы (классы Professor, Student).
 * Вам необходимо сделать следующее:
 *   1. Завершить классы профессора, ученика, реализовав абстрактный метод work ();
 *   2. Добавить геттеры и сеттеры в каждый класс;
 *   3. Добавить некоторые специфические методы для расширения подклассов с новым поведением;
 *   4. Следовать принципам инкапсуляции;
 *   5. Создать как минимум 3 новых класса, которые наследуют уже предоставленные, и выполнить 4 пункта, описанных выше;
 * Классы для выполнения задачи находятся в пакете io.github.valentyn.nahai.oop.inheritance.people.
 */
public class InheritanceMain {
    public static void main(String[] args) {


        Person student1 = new Student("student1");
        Person student2 = new Student("student2", "s-2", "My Univesity");
        Student.getAllStudentsCount();
        System.out.println(student1.toString());
        System.out.println(student2.toString());
        

        System.out.println("--------------------");

        Person professor1 = new Professor("My Univesity", "CS");
        Person professor2 = new Professor("professor2", "p-2", "My Univesity", "CS");
        professor1.work();
        System.out.println(professor1.toString());
        System.out.println(professor2.toString());

        System.out.println("--------------------");

        Person stuff1 = new Stuff();
        Person stuff2 = new Stuff("Stuff2");
        Stuff.getAllStuffCount();
        stuff2.work();
        
        System.out.println(stuff1.toString());
        System.out.println(stuff2.toString());

        System.out.println("--------------------");

        Person group1 = new Group();
        Person group2 = new Group("M-156", "management");

        System.out.println(group1.toString());
        System.out.println(group2.toString());

        Student.getAllStudentsCount();
        Group.getAllStudentsCount();
    }
}
