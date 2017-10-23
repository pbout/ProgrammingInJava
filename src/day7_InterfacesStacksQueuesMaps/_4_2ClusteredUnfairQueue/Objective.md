# 4.2 Clustered Unfair Queue
Implement the interface queue in a way that the next person 
retrieved is always a person over 65, if there is any in
the queue; if not, it must be a person over 18, if there is any in 
the queue. Inside each age category, the behaviour of the queue is 
typical FIFO: first in, first out.

These two queues are examples of priority queues, and are not 
strictly FIFO: old people will always come out of the queue before 
younger people, even if the youngsters came to the queue first. 
Priority queues are more difficult to implement, but they are 
also important in computing. For example, your hard disk uses a 
priority queue to decide where to move next: if the disk’s head is 
at position 555 and the queue of requests is

```4, 99, 234, 500, 101, 43, 881, 77```

your disk may decide to move to position 500 to reduce movement, 
time, and energy consumption.