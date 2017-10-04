package day5_TransitionToJava._8BigEnough;

import java.util.Scanner;

public class Run {
    Scanner s = new Scanner(System.in);
    int[] ids = new int[0];
    String[] names = new String[0];

    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    /**
     * Loops through user input and prints the employees at the end
     * as per objective instructions.
     * TODO : Only even entries are saved !?!?!?!
     */
    private void start(){
        int id = 0;
        String name = "";
        do {
            System.out.print("Please enter an ID: ");
            String input = s.nextLine();
            if (!input.isEmpty()){
                id = Integer.parseInt(input);
                System.out.print("Please enter a name: ");
                name = s.nextLine();
                if (!name.isEmpty()){
                    expandArrays();
                    ids[ids.length-1] = id;
                    names[names.length-1] = name;
                }else{
                    name="";
                }
            }else{
                System.out.println("Please enter an ID or 0 to finish.");
            }
        }while(id != 0 && !name.equals(""));

        printEmployee();
    }

    /**
     * Expands the arrays holding the user information by 1 prior to adding
     * new data.
     */
    private void expandArrays(){

        int[] newIds = new int[ids.length + 1];
        String[] newNames = new String[names.length + 1];

        for(int i = 0; i < ids.length; i++){
            newIds[i] = ids[i];
            newNames[i] = names[i];
        }

        ids = newIds;
        names = newNames;
    }

    /**
     * prints all employees as per objective instructions.
     */
    private void printEmployee(){
        for (int i = 0; i < ids.length; i++){
            if (ids[i] % 2 == 0 || names[i].startsWith("S")){
                System.out.println("ID: " + ids[i] + " | Name: " + names[i]);
            }
        }
    }

}
