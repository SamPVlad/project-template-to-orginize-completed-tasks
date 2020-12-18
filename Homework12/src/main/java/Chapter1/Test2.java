package Chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Test2 {

    public static void main(String[] args) {

        List<Phone> phoneList = new ArrayList<Phone>();
        Collections.addAll(phoneList, new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
            new Phone("Samsung Galaxy S 6", 40000));
        
        Stream<String> citiesStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
        citiesStream.forEach(System.out::println);
        System.out.println("1-----------------");

        phoneList.stream().filter(p->p.getPrice()<50000).forEach(p-> System.out.println("m " + p.getName() + p.getCompany()));
        //m Lumia 950null
        //m Samsung Galaxy S 6null
        System.out.println("2-----------------");
        
        phoneList.stream().filter(p->p.getPrice()<50000).forEach(p-> System.out.println(p.getName()));
        //Lumia 950
        //Samsung Galaxy S 6
        System.out.println("3-----------------");
        
        phoneList.stream().map(Phone::getName).forEach(System.out::println); 
        //// помещаем в поток только названия телефонов
        /// <R> Stream<R> map(Function<? super T, ? extends R> mapper)
        // ???????????????????????????????????????????
        System.out.println("4-----------------");
        
        phoneList.stream().map(p->"name: " + p.getName() + " price: " + p.getPrice()).forEach(System.out::println);
        //name: iPhone 6 S price: 54000
        //name: Lumia 950 price: 45000
        //name: Samsung Galaxy S 6 price: 40000
        System.out.println("5-----------------");
        
        phoneList.stream()
            .flatMap(p->Stream.of(
                String.format("название: %s  цена без скидки: %d", p.getName(), p.getPrice()),
                String.format("название: %s  цена со скидкой: %d", p.getName(), p.getPrice() - (int)(p.getPrice()*0.1))
        ))
        .forEach(s->System.out.println(s));
        //название: iPhone 6 S  цена без скидки: 54000
        //название: iPhone 6 S  цена со скидкой: 48600
        //название: Lumia 950  цена без скидки: 45000
        //название: Lumia 950  цена со скидкой: 40500
        //название: Samsung Galaxy S 6  цена без скидки: 40000
        //название: Samsung Galaxy S 6  цена со скидкой: 36000
    }
}
