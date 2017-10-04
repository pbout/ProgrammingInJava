package day6_OntoJava._9DoPracticeWhileUnderstood;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        int current = 0;
        int students = 0;
        int distinctions = 0;
        int pass = 0;
        int fail = 0;
        int invalid = 0;
        while (current!=-1){
            Scanner s = new Scanner(System.in);
            System.out.print("Input a mark: ");
            current = s.nextInt();
            if (current >= 70 && current <=100){
                students++;
                distinctions++;
            }else if(current >=50 && current <= 69){
                students++;
                pass++;
            }else if(current >= 0 && current <= 49){
                students++;
                fail++;
            }else{
                invalid++;
            }
        }
        System.out.println("There are " + students +
                " students: " + distinctions +
                " distinctions, " + pass +
                " pass, " + fail +
                " fails (plus " +invalid +
                " invalid).");
    }
}
