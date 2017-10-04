package day6._9DoPracticeWhileUnderstood;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Marks m = new Marks();
        Boolean end = false;
        while(!end){
            Scanner s = new Scanner(System.in);
            System.out.println("Enter next grade: ");
            end = m.addMark(s.nextInt());
            System.out.println("You entered: " + s.nextInt());
        }
        m.printAll();
    }
}
