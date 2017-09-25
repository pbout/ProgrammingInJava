package week6._6Stacks;

public class Item {
    private int value;
    private Item next = null;

    Item(int value){
        this.value = value;
        next = null;
    }

    Item getNext(){
        return next;
    }

    void setNext(Item item){
        this.next = item;
    }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }
}
