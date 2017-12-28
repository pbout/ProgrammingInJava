package day8_Inheritance._1Extension_Extension;

public class OldPhone implements Phone {
    @Override
    public void call(String number) {
        System.out.println("Calling: " + number);
    }
}
