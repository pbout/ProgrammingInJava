package day6_OntoJava._5Queues;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        Queue q = new Queue();
        System.out.println("Size: " + q.size());
        q.insert(1);
        System.out.println("Size: " + q.size());
        q.insert(2);
        System.out.println("Size: " + q.size());
        q.insert(3);
        System.out.println("Size: " + q.size());
        q.insert(4);
        System.out.println("Size: " + q.size());
        q.insert(5);
        System.out.println("Size: " + q.size());
        q.insert(6);
        System.out.println("Size: " + q.size());
        q.insert(7);
        System.out.println("Size: " + q.size());
        q.insert(8);
        System.out.println("Size: " + q.size());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());
        q.insert(1);
        System.out.println("Size: " + q.size());
        System.out.println(q.retrieve());
        System.out.println(q.retrieve());

    }
}
