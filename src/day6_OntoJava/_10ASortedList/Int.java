package day6_OntoJava._10ASortedList;

public class Int {
    private int value;
    private Int next;

    public Int(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Int getNext() {
        return next;
    }

    public void setNext(Int next) {
        this.next = next;
    }
}
