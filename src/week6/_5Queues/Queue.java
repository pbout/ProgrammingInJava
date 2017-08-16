package week6._5Queues;

public class Queue {

    private Item first;
    private Item last;

    public void insert(int i){
        //TODO
        Item item = new Item(i);
        if(first == null && last == null) {
            first = item;
            last = item;
        }else if(first.equals(last)){
            first = item;
            first.setNext(last);
            last.setPrevious(first);
        }else {
            item.setNext(first);
            first.setPrevious(item);
            first = item;
        }
    }

    public int retrieve(){
        //TODO
        return 0;
    }

    public int size(){
        //TODO
        int result = 0;
        Item current;
        if(first==null && last == null){
            return 0;
        }else if(first.equals(last)){
            return 1;
        }else{
            current = first;
            while(!current.getNext().equals(last)){
                result++;
                current = current.getNext();
            }
        }
        return result;
    }
}
