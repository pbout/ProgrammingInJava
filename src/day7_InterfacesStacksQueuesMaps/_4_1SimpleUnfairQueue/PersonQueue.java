package day7_InterfacesStacksQueuesMaps._4_1SimpleUnfairQueue;

import day7_InterfacesStacksQueuesMaps._1SuperMarketQueue.Person;

public interface PersonQueue {

    /**
     * Adds another person to the queue.
     */
    void insert(Person person);

    /**
     * Removes a person from the queue.
     */
    day7_InterfacesStacksQueuesMaps._4_1SimpleUnfairQueue.Person retrieve();
}
