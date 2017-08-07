package week6._2QueueLength;

import week6._1SinglyLinkedLists.Hospital;
import week6._1SinglyLinkedLists.Patient;

public class PatientList {
    private Hospital hospital;

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
