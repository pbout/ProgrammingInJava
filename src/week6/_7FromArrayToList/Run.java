package week6._7FromArrayToList;
import utilities.ArrayUtilities;
import utilities.Int;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    /**
     * Uses the ArrayUtilities.toList method located in the utilities package.
     */
    //TODO : Problem with last element. The while loop does not run for the final case.
    private void start(){
        int[] i = {1,2,3,4,5,6,7,8,9,0};
        Int j = ArrayUtilities.toList(i);
        while (j.getNext() != null){
            System.out.println(j.getValue());
            j =  j.getNext();
        }
    }
}
