package Day1_IntroguctionToGroovy._6Division;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Devide " + n1 + " by...");
        int n2 = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int remainder = n1;

        while (remainder >= n2){
            remainder = remainder - n2;
            counter++;
        }

        System.out.println("Number: " + n1 + " devided by " + n2 + " is: " + counter + " with remainder " + remainder);
    }
}
