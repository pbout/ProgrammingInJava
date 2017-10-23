package day7_InterfacesStacksQueuesMaps._1SuperMarketQueue;

public class PersonQueuePointer implements PersonQueue {
    private Person first;
    private Person last;
    private int size;

    public PersonQueuePointer(){
        first = null;
        last = null;
        size = 0;
    }

    /**
     * Receives a person object and inserts it last in the queue.
     * First and Last are references from the perspective of the cashier.
     * The first is the first person in line to be served and last is the person in the
     * back of the line.
     * @param person            Receives a Person object.
     */
    @Override
    public void insert(Person person) {
        if (size > 1){
            last.setPrevious(person);
            person.setNext(last);
            last = person;
        }else if(size == 1){
            last = person;
            last.setNext(first);
            first.setPrevious(last);
        }else if(size == 0){
            first = person;
            last = person;
        }
        size++;
    }

    /**
     * Removes the next person from the queue and returns it.
     * First and Last are references from the perspective of the cashier.
     * The first is the first person in line to be served and last is the person in the
     * back of the line.
     * @return
     */
    @Override
    public Person retrieve() {
        System.out.println("Size is:" + size);
        Person serve = first;
        if (size > 2) {
            first = first.getPrevious();
            first.getNext().setPrevious(null);
            first.setNext(null);
            size--;
        }else if(size == 2){
            first = last;
            first.getNext().setPrevious(null);
            first.setNext(null);
            size--;
        }else if(size == 1){
            first = null;
            last = null;
            size = 0;
        }else{
            return new Person("EMPTY");
        }
        return serve;
    }

}
