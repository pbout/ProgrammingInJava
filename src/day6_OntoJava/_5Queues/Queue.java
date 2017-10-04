package day6_OntoJava._5Queues;

public class Queue {

    private Item first;
    private Item last;

    /**
     * Receives an integer and adds it into the queue.
     * @param i         The integer to add to the queue.
     */
    public void insert(int i){
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
        int result = 0;
        if (size() > 2) {
            result = last.getValue();
            last = last.getPrevious();
            last.getNext().setPrevious(null);
            last.setNext(null);
        }else if (size() == 2){
            result = last.getValue();
            last.setPrevious(null);
            first.setNext(null);
            last = first;
        }else if (size() == 1){
            result = last.getValue();
            first = null;
            last = null;
        }else{
            result = 0;
        }
        return result;
    }

    /**
     * Counts the number of elements contained in the queue.
     * @return          Returns the length of the queue.
     */
    public int size(){
        int result = 2;
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
