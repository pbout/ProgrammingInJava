package day6_OntoJava._6Stacks;

public class Run {
    public static void main(String[] args){
        Run run = new Run();
        run.start();
    }

    private void start(){
        Stack s = new Stack();
        System.out.println("Adding numbers 1,2,3,4,5 into the stack");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("Popping numbers one by one: " + s.pop() +
                "," + s.pop() +
                "," + s.pop() +
                "," + s.pop() +
                "," + s.pop() +
                "," + s.pop() +
                "," + s.pop());
        System.out.println("Adding the number 4");
        s.push(4);
        System.out.println("Popping numbers one by one: " + s.pop() +
                "," + s.pop() +
                "," + s.pop());
        System.out.println("Adding some items to test the empty() method");
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.empty();
        System.out.println("Should return 0: " + s.pop());
        System.out.println("Adding 2 more numbers");
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }
}
