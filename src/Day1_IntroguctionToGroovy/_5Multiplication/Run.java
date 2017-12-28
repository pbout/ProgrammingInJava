package Day1_IntroguctionToGroovy._5Multiplication;

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
        System.out.println("Multiply " + n1 + " to...");
        int n2 = Integer.parseInt(scanner.nextLine());

        int counter = 0;
        int result = 0;
        while (counter < n2){
            result = result + n1;
            counter++;
        }

        System.out.println("Result: " + result);
    }
}
