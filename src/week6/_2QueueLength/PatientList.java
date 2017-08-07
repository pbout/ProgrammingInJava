package week6._2QueueLength;

import week6._1SinglyLinkedLists.Hospital;
import week6._1SinglyLinkedLists.Patient;

public class PatientList {
    private Hospital hospital;

    public PatientList(Hospital hospital){
        this.hospital = hospital;
    }

    /**
     * Counts all the links of a linked list present in the hospital object.
     * Requires a hospital object with a linked list.
     * @return          Returns a numeric representation of the size of the list.
     */
    public int size(){
        int result = 1;
        Patient patient = hospital.getFirstPatient();
        if (hospital.getFirstPatient() == null){
            return 0;
        }
        while (hospital.getNextPatient(patient) != null){
            patient = hospital.getNextPatient(patient);
            result++;
        }
        return result;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
