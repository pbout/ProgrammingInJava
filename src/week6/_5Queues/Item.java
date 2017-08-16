package week6._5Queues;

public class Item {
    int value;
    Item next;
    Item previous;

    public Item(int value){
        this.value = value;
        next = null;
        previous = null;
    }

    public Item getNext(){
        return next;
    }

    public Item getPrevious(){
        return previous;
    }

    public void setNext(Item item){
        this.next = item;
    }

    public void setPrevious(Item item){
        this.previous = item;
    }
}
