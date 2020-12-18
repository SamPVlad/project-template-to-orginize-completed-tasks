package Chapter1;

import java.util.*;

public class Test8 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        if(min.isPresent()){
            System.out.println(min.get());
        } else System.out.println("empty");

        
        System.out.println("1-----------------------");
        
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min1 = numbers.stream().min(Integer::compare);
        System.out.println(min1.orElse(-1));//1
        min1.ifPresent(System.out::println);//1
                System.out.println("2-----------------------");

        Optional<Integer> min2 = numbers.stream().min(Integer::compare);
        Random rnd = new Random();
        System.out.println(min2.orElseGet(()->rnd.nextInt(1000)));
                System.out.println("3-----------------------");

        
        Optional<Integer> min3 = numbers.stream().min(Integer::compare);
        //System.out.println(min3.orElseThrow(IllegalStateException::new));
        System.out.println("4-----------------------");

 
        Optional<Integer> min4 = numbers.stream().min(Integer::compare);
        min4.ifPresentOrElse(
            System.out::println,
            () -> System.out.println("Value not found")
        );
    }
}
    

