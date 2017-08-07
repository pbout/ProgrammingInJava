package week6._1SinglyLinkedLists;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    private void start(){
        Hospital hospital = new Hospital();
        System.out.println("The first patient is: " + hospital.getFirstPatient());

        hospital.addPatient(new Patient("Mary", 22, "Broken Leg"));
        System.out.println("The first patient is: " + hospital.getFirstPatient().toString());
        System.out.println("The first patient using index is: " + hospital.getPatient(1).toString());

        hospital.addPatient(new Patient("Bob", 12, "Flu"));
        System.out.println("The second patient is: " + hospital.getPatient(2).toString());
        System.out.println("The third non-existant patient is: " + hospital.getPatient(3));

        hospital.addPatient(new Patient("Helen", 72, "Headache"));
        System.out.println("Now the second patient is: " + hospital.getPatient(2).toString());
        System.out.println("And the third patient is: " + hospital.getPatient(3).toString());


    }
}
