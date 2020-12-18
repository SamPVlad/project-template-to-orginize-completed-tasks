package Chapter1;

import java.util.*;
import java.util.stream.*;

public class Test9 {
    public static void main(String[] args) {

        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                                            "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                                            "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        List<String> filteredPhones = phones.stream()
            .filter(s->s.length()<10)
            .collect(Collectors.toList());

        for(String s : filteredPhones){
            System.out.println(s);
        }

        System.out.println("------------------------------------------");
                
        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 8", 54000),
                                                new Phone("Nokia 9", 45000),
                                                new Phone("Samsung Galaxy S9", 40000),
                                                new Phone("LG G6", 32000));
        
        Map<String, Integer> phones1 = phoneStream
            .collect(Collectors.toMap(p->p.getName(), t->t.getPrice()));

        phones1.forEach((k,v)->System.out.println(k + " " + v));
        
        System.out.println("------------------------------------------");
        
        HashSet<String> filteredPhones1 = phones.stream().filter(s->s.length()<12).
            collect(Collectors.toCollection(HashSet::new));

        filteredPhones1.forEach(s->System.out.println(s));
        
        System.out.println("------------------------------------------");

        ArrayList<String> filteredPhones2 = phones.stream().filter(s->s.length()<12)
            .collect(
                ()->new ArrayList<String>(),
                (list, item)->list.add(item), //ArrayList::add, ??????????????
                (list1, list2)-> list1.addAll(list2)); 

        filteredPhones2.forEach(s->System.out.println(s));
        
        
        //??????????????????????????????????
        //<R> R collect(Supplier<R> supplier, BiConsumer<R,? super T> accumulator, BiConsumer<R,R> combiner)
        //supplier: создает объект коллекции
        //
        //accumulator: добавляет элемент в коллекцию
        //
        //combiner: бинарная функция, которая объединяет два объекта
        
        
        
        
    }



}
