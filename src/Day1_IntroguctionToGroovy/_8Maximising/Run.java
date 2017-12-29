package Day1_IntroguctionToGroovy._8Maximising;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        int max = 0;

        System.out.println("Enter a series of numbers to get the highest value. Enter -1 to end.");
        while (number != -1) {
            number = Integer.parseInt(scanner.nextLine());
            if (number > max){
                max = number;
            }
        }

        if (max == 0){
            System.out.println("There's nothing to see...");
        }else{
            System.out.println("The highest value is: " + max);
        }
    }
}
