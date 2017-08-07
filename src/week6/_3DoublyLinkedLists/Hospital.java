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

    public void delete(Patient patient){
        //TODO
    }

    public void delete(int index){
        //TODO
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
        Patient result = firstPatient;
        int i = 0;
        if (index == 1){
            return firstPatient;
        }else{
            while(i < index-1){
                result = result.getNextPatient();
                i++;
            }
        }
        return result;
    }

    public Patient getFirstPatient(){
        //TODO
        return null;
    }

    public Patient getLastPatient(){
        //TODO
        return null;
    }

    public void setFirstPatient(Patient patient){
        //TODO
    }

    public void  setLastPatient(Patient patient){
        //TODO
    }

}
