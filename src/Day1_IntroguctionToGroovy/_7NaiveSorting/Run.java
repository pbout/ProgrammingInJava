package Day1_IntroguctionToGroovy._7NaiveSorting;

import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");
        int n1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter second number");
        int n2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter third number");
        int n3 = Integer.parseInt(scanner.nextLine());

        if (n1 > n2){
            if (n2 > n3){
                int temp = n2;
                n2 = n3;
                n3 = temp;
            }
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n2 > n3){
            if (n1 > n3){
                int temp = n1;
                n1 = n3;
                n3 = temp;
            }
            int temp = n2;
            n2 = n3;
            n3 = temp;
        }
        System.out.println("The numbers in order are: " + n1 + "," + n2 + "," + n3);
    }
}
