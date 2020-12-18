package Chapter1;

import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        
        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.takeWhile(n -> n < 0)
            .forEach(System.out::println);
        System.out.println("1-----------------");

        Stream<Integer> numbers1 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5, 6);
        numbers1.sorted().takeWhile(n -> n < 0)
            .forEach(System.out::println);
        System.out.println("2-----------------");

        Stream<Integer> numbers2 = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5, 6);
        numbers2.sorted().dropWhile(n -> n < 0)
            .forEach(System.out::println);
        System.out.println("3-----------------");

        Stream<String> people1 = Stream.of("Tom", "Bob", "Sam");
        Stream<String> people2 = Stream.of("Alice", "Kate", "Sam");

        Stream.concat(people1, people2).forEach(System.out::println);
        System.out.println("4-----------------");

        Stream<String> people = Stream.of("Tom", "Bob", "Sam", "Tom", "Alice", "Kate", "Sam");
        people.distinct().forEach(System.out::println);
        
    }
}
