package day7_InterfacesStacksQueuesMaps._1SuperMarketQueue;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    private void start(){
        PersonQueue pq = new PersonQueuePointer();
        System.out.println("Person is: " + pq.retrieve().getName());
        pq.insert(new Person("Mary"));
        pq.insert(new Person("Bob"));
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        pq.insert(new Person("Mike"));
        pq.insert(new Person("Hellen"));
        pq.insert(new Person("Eric"));
        pq.insert(new Person("James"));
        pq.insert(new Person("Steve"));
        pq.insert(new Person("Marc"));
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
        System.out.println("Person is: " + pq.retrieve().getName());
    }
}
