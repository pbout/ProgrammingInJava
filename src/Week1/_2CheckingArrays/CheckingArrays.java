package Week1._2CheckingArrays;

public class CheckingArrays {

    public static final String[] SYMMETRICAL_ARRAY = {"1","2","3","A","B","A","3","2","1"};
    public static final String[] NON_SYMMETRICAL_ARRAY = {"1","4","3","d","w","4"};

    public static void main(String[] args) {
        CheckingArrays ch = new CheckingArrays();
        ch.run();
    }

    private void run(){
        System.out.println("The Array SYMMETRICAL_ARRAY is symmetrical: " + checkForSymmetry(SYMMETRICAL_ARRAY));
        System.out.println("The Array NON_SYMMETRICAL_ARRAY is symmetrical: " + checkForSymmetry(NON_SYMMETRICAL_ARRAY));
    }

    /**
     * Receives a String Array containing a series of string elements. If the array
     * is symmetrical it returns true, otherwise false.
     * @param input     An array of Strings
     * @return          True if symmetrical, false otherwise.
     */
    private boolean checkForSymmetry(String[] input){
        int j = input.length-1;
        for(int i = 0; i<(input.length/2); i++){
                if (input[i]!=input[j]) {
                    return false;
                }
                j--;
        }
        return true;
    }

}
