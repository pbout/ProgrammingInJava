package Day1_IntroguctionToGroovy._10YouSaidHighISaidLow;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        int number = -2;
        int next = 0;
        int previous = 0;
        Boolean sequential = true;

        while (number != -1){
            if (number == -2){
                System.out.println("Enter the first number");
                number = Integer.parseInt(scanner.nextLine());
                next = number + 1;
                previous = number -1;
            }
            System.out.println("Enter the next number");
            number = Integer.parseInt(scanner.nextLine());
            if (number != -1){
                if (number != next && number != previous){
                    sequential = false;
                }
            }
            if (number == next){
                next = number + 1;
            }else if (number == previous){
                previous = number -1;
            }
        }

        if (sequential){
            System.out.println("The numbers were SEQUENTIAL");
        }else{
            System.out.println("The numbers were NOT Sequential");
        }
    }
}
