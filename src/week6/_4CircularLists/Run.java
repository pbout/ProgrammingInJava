package week6._4CircularLists;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Hospital hospital = new Hospital();
        System.out.println("The size is: " + hospital.size());
        hospital.add(new Patient("James", 11, "Healthy"));
        System.out.println("The size is: " + hospital.size());
        hospital.add(new Patient("Mary", 66, "Healthy"));
        System.out.println("The size is: " + hospital.size());
        hospital.add(new Patient("Bob", 22, "PinkEye"));
        System.out.println("The size is: " + hospital.size());
        hospital.add(new Patient("James", 32, "Fever"));
        System.out.println("The size is: " + hospital.size());
        hospital.add(new Patient("Kosta", 43, "Sorethroat"));
        System.out.println("The size is: " + hospital.size());
        System.out.println(hospital.printAll());

    }
}
