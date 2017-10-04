package day5._3CopyingArrays;

public class ArrayCopier {
    private String[] src = {"a","4","b","g","g","H","C","6"};
    private String[] dstE = new String[8];              // Destination of Equal Size
    private String[] dstS = new String[4];              // Destination of Smaller Size
    private String[] dstL = new String[12];             // Destination of Larger Size

    public static void main(String[] args) {
        ArrayCopier ac = new ArrayCopier();
        ac.run();
    }

    private void run(){
        copy(src,dstE);
        for (String s: dstE){
            System.out.print(s + ", ");
        }
        System.out.println("");

        copy(src,dstS);
        for (String s: dstS){
            System.out.print(s + ", ");
        }
        System.out.println("");

        copy(src,dstL);
        for (String s: dstL){
            System.out.print(s + ", ");
        }
        System.out.println("");

    }

    /**
     * Receives two arrays and copies one into the other.
     * If the source array is larger or equal than the destination, only the elements
     * that fit will eb coppied. Otherwise empty elements will be filled with zeroes.
     * @param src       Source array
     * @param dst       Destination array
     * @return
     */
    private String[] copy(String[] src, String[] dst){
        for (int i = 0; i < dst.length; i++) {
            if (i < src.length) {
                dst[i] = src[i];
            }else{
                dst[i] = "0";
            }
        }
        return dst;
    }

}
