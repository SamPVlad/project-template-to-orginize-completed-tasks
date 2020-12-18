package Chapter1;

import java.util.*;

public class Test6 {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        names.addAll(Arrays.asList(new String[]{"Tom", "Sam", "Bob", "Alice"}));
        System.out.println(names.stream().count()); 
        
        System.out.println(names.stream().filter(n->n.length()<=3).count());

        System.out.println("1_________________");
        
        Optional<String> first = names.stream().findFirst();
        System.out.println(first.get());   

        Optional<String> any = names.stream().findAny();
        System.out.println(any.get());

        System.out.println("2_________________");

        boolean any1 = names.stream().anyMatch(s->s.length()>3);
        System.out.println(any1);   

        boolean all = names.stream().allMatch(s->s.length()==3);
        System.out.println(all);  

        boolean none = names.stream().noneMatch(s->s=="Bill");
        System.out.println(none);

        System.out.println("3_________________");

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));

        
//        ?????????????????????????????????????????????????////
//        Optional<Integer> min1 = numbers.stream().min(Comparator.comparingInt(a -> a));
//        Optional<Integer> min2 = numbers.stream().min((a, b) -> Comparator.compare(a, b));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        System.out.println(min.get()); 
        System.out.println(max.get());

        System.out.println("4_________________");

        ArrayList<Phone> phones = new ArrayList<Phone>();
        phones.addAll(Arrays.asList(new Phone[]{
            new Phone("iPhone 8", 52000),
            new Phone("Nokia 9", 35000),
            new Phone("Samsung Galaxy S9", 48000),
            new Phone("HTC U12", 36000)
        }));
        
        //Как работает метод в классе???????????????????????????????
        Phone min1 = phones.stream().min(Phone::compare).get();
        Phone max1 = phones.stream().max(Phone::compare).get();
        System.out.printf("MIN Name: %s Price: %d \n", min1.getName(), min1.getPrice());
        System.out.printf("MAX Name: %s Price: %d \n", max1.getName(), max1.getPrice());        
    }
}

