package day7_InterfacesStacksQueuesMaps._4_1SimpleUnfairQueue;

public class Person {
    private String name;
    private int age;
    private Person next;
    private Person previous;

    public Person(String name){
        this.name = name;
        next = null;
        previous = null;
    }

    // Getters
    public String getName() { return name; }
    public Person getNext() { return next; }
    public Person getPrevious() { return previous; }
    public int getAge() { return age; }

    // Setters
    public void setName(String name) { this.name = name; }
    public void setNext(Person next) { this.next = next; }
    public void setPrevious(Person previous) { this.previous = previous; }
    public void setAge(int age) { this.age = age; }
}
