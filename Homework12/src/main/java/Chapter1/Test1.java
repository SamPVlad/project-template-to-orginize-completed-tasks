package Chapter1;

import java.util.stream.*;
import java.util.*;


public class Test1 {
        
    public static void main(String[] args) {
        
        long count = IntStream.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5).filter(w -> w > 0).count();
        System.out.println(count); 
        //5
        System.out.println("-----------------");
        
        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        System.out.println(cities); //[Париж, Лондон, Мадрид]
        cities.stream()
            .filter(s->s.length()==6)
            .forEach(s-> System.out.println(s)); 
        //  Лондон 
        //  Мадрид
        System.out.println("-----------------");
        
        Stream<String> citiesStream1 = cities.stream();
        citiesStream1 = citiesStream1.filter(s-> s.length() == 6);
        System.out.println(citiesStream1); //java.util.stream.ReferencePipeline$2@5f184fc6
        citiesStream1.forEach(s-> System.out.println(s)); 
        //  Лондон 
        //  Мадрид
        System.out.println("-----------------");
        
        Stream<String> citiesStream2 = Arrays.stream(new String[] {"Париж", "Лондон", "Мадрид"});
        citiesStream2.forEach(s-> System.out.println(s)); 
        //Париж 
        // Лондон 
        // Мадрид
        System.out.println("-----------------");
        
        Stream<String> citiesStream3 = Stream.of("Париж", "Лондон", "Мадрид");
        citiesStream3.forEach(s-> System.out.println(s));
        //Париж 
        // Лондон 
        // Мадрид
        System.out.println("-----------------");
        
        IntStream intStream = Arrays.stream(new int[]{1,2,3,4,5,6,7});
        intStream.forEach(s-> System.out.println(s));
        System.out.println("-----------------");

        IntStream intStream1 = IntStream.of(1,2,3,4,5,6,7);
        intStream1.forEach(s-> System.out.println(s));
        System.out.println("-----------------");
        
        LongStream longStream = Arrays.stream(new long[]{100, 200, 300, 400, 500, 600, 700});
        longStream.forEach(s-> System.out.println(s));
        System.out.println("-----------------");
        
        DoubleStream doubleStream = Arrays.stream(new double[]{3.4, 6.7, 8.2345, 9,6789});
        doubleStream.forEach(s-> System.out.println(s));
        System.out.println("-----------------");
    }
}

