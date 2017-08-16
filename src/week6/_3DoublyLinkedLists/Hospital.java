package week6._3DoublyLinkedLists;

public class Hospital {
    private Patient firstPatient;
    private Patient lastPatient;

    /**
     * Adds a patient at the end of the list.
     * @param patient       Receives a patient object and appends it to
     *                      the end of the linked list.
     */
    public void add(Patient patient){
        if (size()==0){
            firstPatient = patient;
            lastPatient = patient;
        }else if(size() == 1){
            firstPatient.setNextPatient(patient);
            lastPatient = patient;
            lastPatient.setPrevPatient(firstPatient);
        }else{
            patient.setPrevPatient(lastPatient);
            lastPatient.setNextPatient(patient);
            lastPatient = patient;
        }
    }

    /**
     * Removes a Patient from the LinkedList
     * @param patient       The patient to be removed.
     */
    public void delete(Patient patient) {
        Patient current = firstPatient;
        if (patient!= null && firstPatient != null){
            if (areEqual(patient, firstPatient) && size() == 1) {
                firstPatient = null;
                lastPatient = null;
            } else if (areEqual(patient, firstPatient) && size() > 1) {
                firstPatient.getNextPatient().setPrevPatient(null);
                firstPatient = firstPatient.getNextPatient();
            } else if (areEqual(patient, lastPatient) && size() > 1) {
                lastPatient.getPrevPatient().setNextPatient(null);
                lastPatient = lastPatient.getPrevPatient();
            } else {
                while (!areEqual(current, patient)) {
                    if (current != null && patient != null) {
                        current = current.getNextPatient();
                    }
                }
                current.getPrevPatient().setNextPatient(current.getNextPatient());
                current.getNextPatient().setPrevPatient(current.getPrevPatient());
            }
        }
    }

    /**
     * Receives an index and removes the Patient at that index.
     * @param index         The index of the patient ro be removed.
     */
    public void delete(int index){
        Patient patient = getPatient(index);
        delete(patient);
    }

    /**
     * Counts all objects in the linked list and returns their number.
     * @return          The number of elements within the linked list.
     */
    public int size(){
        int result = 1;
        if (firstPatient == null && lastPatient == null){
            return 0;
        }else if(firstPatient == lastPatient){
            return 1;
        }else{
            Patient current = firstPatient;
            while(current.getNextPatient() != null) {
                current = current.getNextPatient();
                result++;
            }
        }
        return result;
    }

    /**
     * Receives an index and returns the patient whose position corresponds
     * to the received index in the list;
     * @param index         The position of the required Patient.
     * @return              The patient in that position.
     */
    public Patient getPatient(int index){
        if (index > size()){
            return null;
        }
        Patient result = firstPatient;
        int i = 0;
        if (index == 1){
            return firstPatient;
        }else{
            while(i < index-1){
                if (firstPatient != null && result != null) {
                    result = result.getNextPatient();
                }
                i++;
            }
        }
        return result;
    }

    /**
     * Getters and setters for first and last patient.
     * @return      The first and last patient.
     */
    public Patient getFirstPatient(){ return firstPatient; }
    public Patient getLastPatient(){ return lastPatient; }
    public void setFirstPatient(Patient patient){ firstPatient = patient; }
    public void  setLastPatient(Patient patient){ lastPatient = patient; }

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
        int i = 1;
        String result = "";
        if (size() == 0){
            result = "There are no elements in the linked list";
            return result;
        }else if (size() == 1) {
            result = "[" + i + "] \t" + firstPatient.getName() + ", \t" + firstPatient.getAge() + ", \t" + firstPatient.getIllness() + "\n";
            return result;
        }else{
            Patient current = firstPatient;
            result = "[" + i + "] \t" + current.getName() + ", \t" + current.getAge() + ", \t" + current.getIllness() + "\n";
            i++;
            while (current.getNextPatient() != null){
                result = result + "[" + i + "] \t" + current.getNextPatient().getName() + ", \t" + current.getNextPatient().getAge() + ", \t" + current.getNextPatient().getIllness() + "\n";
                current = current.getNextPatient();
                i++;
            }
        }
        return result;
    }

    /**
     * Returns the formatted data of a single patient.
     * @param patient       Receives a patient object.
     * @return              Formats the patients data and returns it as string.
     */
    public String printPatient(Patient patient){
        String result = "Name: " + patient.getName() + ", Age:" + patient.getAge()+ ", Illness:" + patient.getIllness();
        return result;
    }
}
