package day9_Polymorphism._0_Example;

import java.util.ArrayList;
import java.util.List;

public class Run {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(3);
        l.add("String");

        for (Object o: l){
            System.out.println(o);
        }
    }
}
