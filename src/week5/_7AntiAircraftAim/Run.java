package week5._7AntiAircraftAim;

import java.util.Scanner;

public class Run {

    Scanner s = new Scanner(System.in);
    Target t = new Target(5,5,5);
    int x = 0;
    int y = 0;
    int z = 0;

    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    /**
     * The method runs until the user achieves a hit!
     */
    public void start(){
        System.out.println("Here they come! Try to bring the plane down! ");
        do {
            System.out.print("Enter a coordinate X ");
            x = Integer.parseInt(s.nextLine());
            System.out.print("Enter a coordinate Y ");
            y = Integer.parseInt(s.nextLine());
            System.out.print("Enter a coordinate Z ");
            z = Integer.parseInt(s.nextLine());
            System.out.println(t.fire(x,y,z));
        }while(t.fire(x,y,z) != Shot.HIT);
    }

}
