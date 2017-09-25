package week6._6Stacks;

public class Stack {
    Item first;

    /**
     * Pushes an integer into the stack. The number is added
     * to the beginning of the stack and is considered as the first.
     * @param i         Receives the number to be added into the stack
     */
    void push(int i){
        Item item = new Item(i);
        if (first == null){
            first = item;
        }else{
            item.setNext(first);
            first = item;
        }
    }

    /**
     * Removes the last item added into the stack (the item
     * in the first position) and returns it's value.
     * @return          Returns the value of the last item added to the stack.
     */
    int pop(){
        int result = 0;
        if (first != null && first.getNext() != null){
            result =  first.getValue();
            Item remove = first;
            first = remove.getNext();
            remove.setNext(null);
        }else if(first != null){
            result = first.getValue();
            first = null;
        }
        return result;
    }

    void empty(){
        first = null; //The entire stack becomes unreachable and gets collected by the garbage collector
    }
}
