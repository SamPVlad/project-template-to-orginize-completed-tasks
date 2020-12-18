package Chapter1;

import java.util.*;
import java.util.stream.*;


public class Test10 {
    public static void main(String[] args) {
        
        List<Phone> phoneList = new ArrayList<Phone>();
        Collections.addAll(phoneList, new Phone("iPhone X", "Apple", 600),
            new Phone("Pixel 2", "Google", 500),
            new Phone("iPhone 8", "Apple",450),
            new Phone("Galaxy S9", "Samsung", 440),
            new Phone("Galaxy S8", "Samsung", 340));

        Stream <Phone> phoneStream = phoneList.stream();
 
        Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
            Collectors.groupingBy(Phone::getCompany));

        for(Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
        //Google
        //Pixel 2
        //
        //Apple
        //iPhone X
        //iPhone 8
        //
        //Samsung
        //Galaxy S9
        //Galaxy S8

        System.out.println("------------------------------------------");

        Stream <Phone> phoneStream1 = phoneList.stream();

        Map<Boolean, List<Phone>> phonesByCompany1 = phoneStream1.collect(
            Collectors.partitioningBy(p->p.getCompany()=="Apple"));

        for(Map.Entry<Boolean, List<Phone>> item : phonesByCompany1.entrySet()){

            System.out.println(item.getKey());
            for(Phone phone : item.getValue()){

                System.out.println(phone.getName());
            }
            System.out.println();
        }
        //false
        //Pixel 2
        //Galaxy S9
        //Galaxy S8
        //
        //true
        //iPhone X
        //iPhone 8
        
        System.out.println("------------------------------------------");

        Stream <Phone> phoneStream2 = phoneList.stream();
        
        Map<String, Long> phonesByCompany2 = phoneStream2.collect(
            Collectors.groupingBy(Phone::getCompany, Collectors.counting()));
        
        for(Map.Entry<String, Long> item : phonesByCompany2.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }
        
        //Google 1
        //Apple 2
        //Samsung 2
        
        System.out.println("------------------------------------------");

        Stream <Phone> phoneStream3 = phoneList.stream();

        Map<String, Integer> phonesByCompany3 = phoneStream3.collect(
            Collectors.groupingBy(Phone::getCompany, Collectors.summingInt(Phone::getPrice)));

        for(Map.Entry<String, Integer> item : phonesByCompany3.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue());
        }
//Google - 500
//Apple - 1050
//Samsung - 780

        System.out.println("------------------------------------------");
 
        Stream <Phone> phoneStream4 = phoneList.stream();

        Map<String, Optional<Phone>> phonesByCompany4 = phoneStream4.collect(
            Collectors.groupingBy(Phone::getCompany,
                Collectors.minBy(Comparator.comparing(Phone::getPrice))));

        for(Map.Entry<String, Optional<Phone>> item : phonesByCompany4.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
        }

        System.out.println("------------------------------------------");

        
        ///???????????????????????????????/ если сокращу, то не пойму что и как с кодом Map какие типы данных получает?
        
        phoneList.stream().collect(
            Collectors.groupingBy(Phone::getCompany,
                Collectors.minBy(Comparator.comparing(Phone::getPrice))));

        for(Map.Entry<String, Optional<Phone>> item : phonesByCompany4.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().get().getName());
        }
//Google - Pixel 2
//Apple - iPhone 8
//Samsung - Galaxy S8

        System.out.println("------------------------------------------");

        Stream <Phone> phoneStream5 = phoneList.stream();

        Map<String, IntSummaryStatistics> priceSummary = phoneStream5.collect(
            Collectors.groupingBy(Phone::getCompany,
                Collectors.summarizingInt(Phone::getPrice)));

        for(Map.Entry<String, IntSummaryStatistics> item : priceSummary.entrySet()){

            System.out.println(item.getKey() + " - " + item.getValue().getAverage());
        }
        //Google - 500.0
        //Apple - 525.0
        //Samsung - 390.0

        System.out.println("------------------------------------------");

        Stream <Phone> phoneStream6 = phoneList.stream();
        
        Map<String, List<String>> phonesByCompany6 = phoneStream6.collect(
            Collectors.groupingBy(Phone::getCompany,
                Collectors.mapping(Phone::getName, Collectors.toList())));

        for(Map.Entry<String, List<String>> item : phonesByCompany6.entrySet()){

            System.out.println(item.getKey());
            for(String name : item.getValue()){
                System.out.println(name);
            }
//            Google
//            Pixel 2
//            Apple
//            iPhone X
//            iPhone 8
//            Samsung
//            Galaxy S9
//            Galaxy S8
        }
    }
    
    

}


 