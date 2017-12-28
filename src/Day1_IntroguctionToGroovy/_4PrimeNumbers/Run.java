package Day1_IntroguctionToGroovy._4PrimeNumbers;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to see if it is prime or not");
        String p = scanner.nextLine();

        if (isPrime(Integer.parseInt(p))){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }

    }

    public boolean isPrime(int value){
        return value % 2 == 0;
    }
}
