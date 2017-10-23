# 5.3  Hash table (*)
Create a class that implements the following interface of a simple 
map from integers to strings: it is a one-to-many mapping. A 
similar map is used in some countries to classify the citizens in
to groups for tax purposes (so that each department has a limited 
number of citizens to examine and process).
```
    /**
    * Map from integer to Strings: one to many
    */
    public interface SimpleMap {
        /**
        * Puts a new String in the map.
        */
        String put(int key, String name);
        
        /**
        * Returns all the names associated with that key,
        * or null if there is none.
        */
        String[] get(int key);
        
        /**
        * Removes a name from the map.
        */
        void remove(int key, String name);
        
        /**
        * Returns true if there are no workers in the map,
        * false otherwise
        */
        boolean isEmpty();
    }
```
Hint: You can implement it with arrays or with linked lists. You do
not
know in advance how many strings
you will receive for every key.