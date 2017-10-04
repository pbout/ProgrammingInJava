package day6._1SinglyLinkedLists;

public class Hospital {
    private Patient firstPatient = null;

    /**
     * Appends a new patient at the end of the singly linked list.
     *
     * @param newPatient        Receives a patient object to be
     *                          added into the list
     */
    public void addPatient(Patient newPatient) {
        Patient current = this.firstPatient;

        if (firstPatient != null) {
            while (current.getNextPatient() != null) {
                current = current.getNextPatient();
            }
            current.setNextPatient(newPatient);
        }else{
            firstPatient = newPatient;
        }
    }

    /**
     * Receives a Patient object and returns it's next Link.
     * @param patient           Receives a Patient object.
     * @return                  Returns the Patient object after that.
     */
    public Patient getNextPatient(Patient patient){
        return patient.getNextPatient();
    }

    /**
     * Set's the first Patient of the list. Can be used to delete the
     * entire list as nothing will point to the consecutive objects
     * which will be picked up by the garbage collector.
     *
     * @param patient           Receives The first patient object of the list.
     */
    public void setFirstPatient(Patient patient){
        firstPatient = patient;
    }

    /**
     * Returns the first Patient object existing in the list
     *
     * @return                  Returns the first Patient object existing in the list.
     *                          Returns null if there is nothing.
     */
    public Patient getFirstPatient(){
        return firstPatient;
    }

    /**
     * Returns the patient by it's position within the list. getPatient(2) will
     * return the second patient. (Starts with 1)
     *
     * @param index             The index of the location of the Patient required.
     * @return                  The patient object at the corresponding index.
     */
    public Patient getPatient(int index) {
        Patient current = this.firstPatient;
        int i = 0;

        if (index == 1 && firstPatient != null){
            return firstPatient;
        }else if (firstPatient != null) {
            while (current.getNextPatient() != null) {
                current = current.getNextPatient();
                i++;
                if (i == index-1) {
                    return current;
                }
            }
        }
        return null;
    }
}
