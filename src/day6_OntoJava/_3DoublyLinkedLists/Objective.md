#Doubly Linked Lists
A **doubly-linked list** is a dynamic list in which each element is connected to <u>two</u>
other elements instead of just one: the one before and the one after it. In this 
exercise, you must create a doubly-linked list using the “hospital and patients” 
example as a starting point.

- Create the doubly-linked list and add several elements to it (around 10 is fine).
- Traverse it forwards and backwards printing out the content of each element.
- Delete a couple of elements from the list.
- Traverse it forwards and backwards printing out the content of each element.
- Add a new element to the list. Try to delete an element that is NOT in the list.
- Traverse it forwards and backwards printing out the content of each element.

Hint: First you need to add a new field to Patient for the pointer going
“backwards”. Then you need to modify the add and delete methods to make sure you 
do not get any loose pointers.