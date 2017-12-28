package day9_Polymorphism._1_Dont_Repeat_Yourself;

public class Run {
    public static void main(String[] args) {
        Comparator c = new Comparator();
        System.out.println("Result for int: " + c.getMax(8,2));
        System.out.println("Result for Double: " + c.getMax((double)8, (double)2));
        System.out.println("Result for String: " + c.getMax("8", "2"));
    }
}
