package day7_InterfacesStacksQueuesMaps._4_1SimpleUnfairQueue;

/*
public class PersonQueueAgePriority implements PersonQueue{
    private Person first;
    private Person last;
    private int size;

    public PersonQueueAgePriority(){
        first = null;
        last = null;
        size = 0;
    }

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

    @Override
    public Person retrieve() {


    }

    private boolean isOldest(Person person){
        int max = first.getAge();
        Person result = first;
        for (int i = 0; i < size; i++){
            if (person.getAge() > max){

            }
        }
    }
}
*/