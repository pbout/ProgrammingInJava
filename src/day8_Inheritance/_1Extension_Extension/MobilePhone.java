package day8_Inheritance._1Extension_Extension;

public class MobilePhone extends OldPhone {
    String[] numbers = new String[10];

    public void ringAlarm(String number) {
        System.out.println("Alarm ringing!!");
    }

    public void playGame(String number) {
        System.out.println("Game launched");
    }

    public void printLastNumbers(){
        for (String i : numbers){
            System.out.println(i);
        }
    }

    @Override
    public void call(String number) {
        System.out.println("Calling and storing: " + number);
        numbers[1] = number;
    }

}
