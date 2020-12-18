package Chapter1;

import java.util.*;
import java.util.stream.Stream;

public class Test3 {

    public static void main(String[] args) {
        List<String> phones = new ArrayList<String>();
        Collections.addAll(phones, "iPhone X", "Nokia 9", "Huawei Nexus 6P",
                                            "Samsung Galaxy S8", "LG G6", "Xiaomi MI6",
                                            "ASUS Zenfone 3", "Sony Xperia Z5", "Meizu Pro 6",
                                            "Pixel 2");

        // сортировка по возрастанию
        phones.stream()
            .filter(p->p.length()<12)
            .sorted()  //How does it work?
            .forEach(System.out::println);
        //????????????????????????????????? "ASUS Zenfone 3" "Samsung Galaxy S8"
        //LG G6
        //Meizu Pro 6
        //Nokia 9
        //Pixel 2
        //Xiaomi MI6
        //iPhone X
        
        System.out.println("1--------------------");
        
        Stream<Phone> phoneStream = Stream.of(
            new Phone("iPhone X", "Apple", 600),
            new Phone("Pixel 2", "Google", 500),
            new Phone("iPhone 8", "Apple",450),
            new Phone("Nokia 9", "HMD Global",150),
            new Phone("Galaxy S9", "Samsung", 300));
        
        phoneStream.sorted(new PhoneComparator())
            .forEach(p-> System.out.printf("%s (%s) - %d \n", p.getName(), p.getCompany(), p.getPrice()));
    }
}

class PhoneComparator implements Comparator<Phone> {  //
    // почему <String или Phone>PhoneComparator если есть возврат????????????????????????????
    // если мі передаем обїект выше, как он работает???????????????

    public int compare(Phone a, Phone b){

        return a.getName().toUpperCase().compareTo(b.getName().toUpperCase());
    }
}