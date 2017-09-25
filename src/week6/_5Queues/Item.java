package week6._5Queues;

public class Item {
    private int value;
    private Item next;
    private Item previous;

    Item(int value){
        this.value = value;
        next = null;
        previous = null;
    }

    Item getNext(){
        return next;
    }

    public Item getPrevious(){
        return previous;
    }

    void setNext(Item item){
        this.next = item;
    }

    void setPrevious(Item item){
        this.previous = item;
    }

    public int getValue() { return value; }

    public void setValue(int value) { this.value = value; }
}
