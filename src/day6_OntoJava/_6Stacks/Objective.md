# Stacks (*)

A stack is a dynamic structure that implements these methods: 

**push(...)** inserts an element at the beginning of the stack.

**pop(...)** remove an element from the beginning of the stack.

**empty(...)** returns true if there are no elements on the stack, 
false otherwise.

Stacks are heavily used in computing. The method call stack that 
stores the variables for each method in aprogram is just one 
well-known example.Implement a stack of integers. This could 
represent requests to a hard drive to read from different sectors.
Implement the three methods listed above. Then write another 
class that creates a stack, and makes several push(), and pop()
calls. Make sure you check the size of the stack before popping 
elements out. Check that the values you get are consistent. 
The output of the program could look like this:

* Pushing 5...
* Pushing 8...
* Pushing 12...
* Popping... it’s a 12
* Pushing 13...
* Popping... it’s a 13
* Popping... it’s a 8
* Popping... it’s a 5
* Stack is empty