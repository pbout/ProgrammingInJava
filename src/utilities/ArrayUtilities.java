package utilities;

public class ArrayUtilities {

    /**
     * Receives an Array of integers and returns a linked list of
     * integers.
     * @param i         Returns the first element of the linked list.
     *                  Remaining elements can be found by going through
     *                  the linked list from te first element.
     * @return
     */
    public static Int toList(int[] i){
        Int first;
        Int current;
        if (i != null && i.length == 0){
            return null;
        }else if(i.length == 1){
            first = new Int(i[0]);
        }else{
            first = new Int(i[0]);
            current = first;
            first.setNext(current);
            for (int j = 1; j < i.length; j++){
                Int next = new Int(i[j]);
                current.setNext(next);
                current = next;
            }
        }
        return first;
    }
}
