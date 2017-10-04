package day6._8InstanceCounter;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    private void start(){
        System.out.println(Spy.getNumberOfSpies());
        Spy newSpy = new Spy(1);
        System.out.println(Spy.getNumberOfSpies());
        Spy newSpy2 = new Spy(2);
        System.out.println(Spy.getNumberOfSpies());
        Spy newSpy3 = new Spy(3);
        System.out.println(Spy.getNumberOfSpies());
        Spy newSpy4 = new Spy(4);
        System.out.println(Spy.getNumberOfSpies());
        System.out.println(Spy.die(3));

    }
}
