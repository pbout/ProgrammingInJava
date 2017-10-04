package day6._4CircularLists;

public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;
    private Patient prevPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        nextPatient = null;
        prevPatient = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIllness() {
        return illness;
    }

    public void setIllness(String illness) {
        this.illness = illness;
    }

    public Patient getNextPatient() {
        return nextPatient;
    }

    public void setNextPatient(Patient nextPatient) {
        this.nextPatient = nextPatient;
    }

    public String toString(){
        return "Name: " + name + ", Age: " + age + ", Illness: " + illness;
    }

    public Patient getPrevPatient() { return prevPatient; }

    public void setPrevPatient(Patient prevPatient) { this.prevPatient = prevPatient; }
}