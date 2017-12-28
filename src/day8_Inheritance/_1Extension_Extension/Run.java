package day8_Inheritance._1Extension_Extension;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        OldPhone op = new OldPhone();
        MobilePhone mp = new MobilePhone();
        SmartPhone sp = new SmartPhone();

        op.call("1111111111");

        mp.call("2222222222");
        mp.printLastNumbers();
        mp.ringAlarm("Alarm");
        mp.playGame("Game");

        sp.call("3333333333");
        sp.printLastNumbers();
        sp.ringAlarm("Alarm");
        sp.playGame("Game");
        sp.browseWeb("www.google.gr");
        sp.findPosition();
    }
}
