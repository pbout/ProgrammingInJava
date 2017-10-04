package day5_TransitionToJava._1DevidingIntegers;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.run();
    }

    private void run(){
        Scanner scanner = new Scanner(System.in);

        String entry1 = scanner.nextLine();
        String entry2 = scanner.nextLine();
        int num1 = Integer.parseInt(entry1);
        int num2 = Integer.parseInt(entry2);

        add(num1, num2);
        subtract(num1,num2);
        multiply(num1, num2);
        divide(num1,num2);
        modulus(num1,num2);
    }

    private void add(int i, int j){
        System.out.println("Addition: " + (i + j));
    }

    private void subtract(int i, int j){
        System.out.println("Subtraction: " + (i - j));
    }

    private void multiply(int i, int j){
        System.out.println("Multiplication: " + (i * j));
    }

    private void divide(int i, int j){
        System.out.println("Devision: " + (i / j));
    }

    private void modulus(int i, int j){
        System.out.println("Modulus: " + (i % j));
    }
}