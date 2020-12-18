package Chapter1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Phone {
    private String name;
    private String company;
    private int price;

    public Phone(String name, int price){
        this.name = name;
        this.price = price;
    }
    
    public Phone(String name, String comp, int price){
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String getCompany() { return company; }

    public static int compare(Phone p1, Phone p2) {
        if(p1.getPrice() > p2.getPrice())
            return 1;
        return -1;
    }
}
