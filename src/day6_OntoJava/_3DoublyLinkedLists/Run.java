package day6._3DoublyLinkedLists;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    private void start(){
        Hospital hospital = new Hospital();

        System.out.println("The current size of the empty list is: " + hospital.size());
        hospital.add(new Patient("Toby", 12, "illness"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("Paul", 20, "Healthy"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("Helen", 33, "Unknown"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("James", 22, "Rash"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("Kelly", 11, "Eyesore"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("Mary", 55, "Healthy"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("Chris", 44, "headache"));
        System.out.println("The size now is: " + hospital.size());

        System.out.println("The patient at index 1 is: " + hospital.getPatient(1).toString());
        System.out.println("The patient at index 2 is: " + hospital.getPatient(2).toString());
        System.out.println("The patient at index 3 is: " + hospital.getPatient(3).toString());
        System.out.println("The patient at index 4 is: " + hospital.getPatient(4).toString());
        System.out.println("The patient at index 5 is: " + hospital.getPatient(5).toString());
        System.out.println("The patient at index 6 is: " + hospital.getPatient(6).toString());
        System.out.println("The patient at index 7 is: " + hospital.getPatient(7).toString());

        System.out.println(hospital.printAll());
        System.out.println(hospital.printPatient(hospital.getPatient(1)));
        hospital.delete(1);
        System.out.println(hospital.printAll());
        hospital.delete(6);
        System.out.println(hospital.printAll());
        hospital.delete(3);
        System.out.println(hospital.printAll());
        hospital.delete(2);
        System.out.println(hospital.printAll());
        hospital.delete(1);
        System.out.println(hospital.printAll());
        hospital.add(new Patient("Koby", 20, "Rash"));
        System.out.println("The size now is: " + hospital.size());
        hospital.add(new Patient("Miranda", 101, "Eyesore"));
        System.out.println("The size now is: " + hospital.size());
        System.out.println(hospital.printAll());
        hospital.delete(1);
        System.out.println(hospital.printAll());
        hospital.delete(12);
        System.out.println(hospital.printAll());
        hospital.delete(1);
        System.out.println(hospital.printAll());
        hospital.delete(10);
        System.out.println(hospital.printAll());
        hospital.delete(1);
        System.out.println(hospital.printAll());
        hospital.delete(1);
        System.out.println(hospital.printAll());

    }
}
