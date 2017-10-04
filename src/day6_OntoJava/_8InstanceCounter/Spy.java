package day6._8InstanceCounter;

public class Spy {
    private static int spyCount = 0;
    private int spyId;

    public Spy(int i) {
        this.spyId = i;
        spyCount++;
    }
    public static int getNumberOfSpies() {
        return spyCount;
    }

    public static String die(int i){
        spyCount--;
        return "Spy " + i + " has been detected and e\n" +
                "liminated";
    }
}
