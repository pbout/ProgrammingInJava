package utilities;

public class Int {
    private int value;
    private Int next;

    public Int(int i){
        value = i;
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
