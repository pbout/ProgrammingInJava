package day7_InterfacesStacksQueuesMaps._2SuperMarketQueueRevisited;

import day7_InterfacesStacksQueuesMaps._1SuperMarketQueue.Person;
import day7_InterfacesStacksQueuesMaps._1SuperMarketQueue.PersonQueue;

public class PersonQueueArray implements PersonQueue{

    Person[] personArray = new Person[0];

    /**
     * Inserts a new Person object into the Array Queue.
     * In this case the first person
     * @param person
     */
    @Override
    public void insert(Person person) {
        if (personArray.length == 0){
            personArray = expand(personArray);
            personArray[0] = person;
        }else{
            personArray = expand(personArray);
            personArray[personArray.length - 1] = person;
        }
    }

    @Override
    public Person retrieve() {
        if (personArray.length > 0) {
            Person result = personArray[0];
            personArray = contract(personArray);
            return result;
        }
        return new Person("EMPTY");
    }

    public Person[] expand(Person[] input){
        Person[] result = new Person[input.length + 1];
        for (int i = 0; i < input.length; i++) {
            result[i] = input[i];
        }
        return result;
    }

    public Person[] contract(Person[] input){
        Person[] result = new Person[input.length - 1];
        for (int i = 1; i <input.length; i++){
            result[i-1] = input[i];
        }
        return result;
    }
}
