package day6_OntoJava._10ASortedList;

public class IntegerList {
    Int start;

    public void add(int value){
        if (start==null){
            start = new Int(value);
        }else if(value >= start.getValue()){
            start.setNext(new Int(value));
        }else if(value < start.getValue()){
            Int tmp = start;
            start = new Int(value);
            start.setNext(tmp);
        }

        if (start==null){
            start = new Int(value);
        }else{
            Int current = start;
            while(current.getNext()!=null){
                if (current.getNext()!=null && value > current.getNext().getValue()){

                }
            }
        }
    }

    void inject(int position, Int value){

    }

    void positionOf(Int object){

    }

    int size(){
        int result = 2;
        if (start==null){
            return 0;
        }else if(start.getNext()==null){
            return 1;
        }else{
            Int current = start;
            while(current.getNext()!= null){
                result++;
                current = current.getNext();
            }
        }
        return result;
    }

    void print(){
        Int current = start;
        while(current.getNext()!=null){
            System.out.print("["+current.getNext().getValue()+"]");
            current = current.getNext();
        }
    }

}
