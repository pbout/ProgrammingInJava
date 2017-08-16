package week6._4CircularLists;

public class Hospital {
    private Patient firstPatient;

    /**
     * Adds a patient at the end of the list.
     * @param patient       Receives a patient object and appends it to
     *                      the end of the linked list.
     */
    public void add(Patient patient){
        if (firstPatient == null){
            firstPatient = patient;
            firstPatient.setNextPatient(firstPatient);
        }else if(size() == 1){
            firstPatient.setNextPatient(patient);
            patient.setNextPatient(firstPatient);
        }else{
            getPatient(size()).setNextPatient(patient);
            patient.setNextPatient(firstPatient);
        }
    }

    /**
     * Removes a Patient from the LinkedList
     * @param patient       The patient to be removed.
     */
    public void delete(Patient patient) {

    }

    /**
     * Receives an index and removes the Patient at that index.
     * @param index         The index of the patient ro be removed.
     */
    public void delete(int index){

    }

    /**
     * Counts all objects in the linked list and returns their number.
     * @return          The number of elements within the linked list.
     */
    public int size(){
        int i = 1;
        if(firstPatient!= null){
            Patient current = firstPatient;
            if(areEqual(firstPatient,firstPatient.getNextPatient())){
                return i;
            }else{
                while(!areEqual(firstPatient,current.getNextPatient())){
                    i++;
                    current = current.getNextPatient();
                }
            }
        }else{
            return 0;
        }
        return i;
    }

    /**
     * Receives an index and returns the patient whose position corresponds
     * to the received index in the list;
     * @param index         The position of the required Patient.
     * @return              The patient in that position.
     */
    public Patient getPatient(int index){
        Patient result = firstPatient;
        int i = 0;
        if(index <= size()){
            while (i < index){
                result = result.getNextPatient();
                i++;
            }
        }
        return null;
    }

    /**
     * Getters and setters for first and last patient.
     * @return      The first and last patient.
     */
    public Patient getFirstPatient(){ return firstPatient; }
    public void setFirstPatient(Patient patient){ firstPatient = patient; }

    /**
     * Checks whether two patients are the same or not. (Same patient is considered
     * a patient having the same records, not nesessarily the same object)
     *
     * @param patient1          The Patient to be tested for equality.
     * @param patient2          The Patient to be tested for equality.
     * @return                  Returns true if both patients have equal values and
     *                          false if the values are not equal or if the patient
     *                          objects are null (either one or both).
     */
    public boolean areEqual(Patient patient1, Patient patient2){
        return patient1 != null &&
                patient2 != null &&
                patient1.getName().equals(patient2.getName()) &&
                patient1.getAge() == patient2.getAge() &&
                patient1.getIllness().equals(patient2.getIllness()) &&
                patient1.getNextPatient() == patient2.getNextPatient() &&
                patient1.getPrevPatient() == patient2.getPrevPatient();
    }

    /**
     * Creates a string containing the formatted data of all patients in
     * tabular form.
     * @return              A table containing all Patients and their records.
     */
    public String printAll(){
        Patient patient = firstPatient;
        String result = "Name: " + patient.getName() + ", Age: " + patient.getAge() + ", Illness: " + patient.getIllness() + "\n";
        while (!areEqual(patient, firstPatient)){
            patient = patient.getNextPatient();
            result = result + "Name: " + patient.getNextPatient().getName() + ", Age: " + patient.getNextPatient().getAge() + ", Illness: " + patient.getNextPatient().getIllness() + "\n";
        }
        return result;
    }

    /**
     * Returns the formatted data of a single patient.
     * @param patient       Receives a patient object.
     * @return              Formats the patients data and returns it as string.
     */
    public String printPatient(Patient patient){
        return null;
    }
}
