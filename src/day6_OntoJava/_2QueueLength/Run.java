package day6._2QueueLength;

import day6._1SinglyLinkedLists.Hospital;
import day6._1SinglyLinkedLists.Patient;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Hospital hospital = new Hospital();
        PatientList list = new PatientList(hospital);

        System.out.println("The current size of the empty list is: " + list.size());
        hospital.addPatient(new Patient("Tom Guy", 5, "Stomachache"));
        System.out.println("Now The current size of the list is: " + list.size());
        hospital.addPatient(new Patient("James Carter", 12, "broken arm"));
        hospital.addPatient(new Patient("Katey Hamilton", 23, "hearing loss"));
        System.out.println("Now The current size of the list is: " + list.size());
    }
}
