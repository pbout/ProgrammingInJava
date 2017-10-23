# 8. Instance counter

**Note:** This exercise is designed to help you practice the meaning of
_static_ fields. However, remember that adding static fields to your 
classes is usually a bad idea. Do not do it unless you have a very 
good reason. Hint: _never_ do it in Programming in Java.

Complete the example given in the notes with a class called Spy. Your 
class must have:

* One and only one _static_ variable, and int called _spyCount_.
* An instance variable of type _int_ for the spy’s ID.
* A constructor method that receives the ID of the spy as an argument, 
increases **spyCount(int)** by one, and prints on the screen the ID of 
this spy plus the total number of spies so far.
* A **die()** method that prints on the screen “_Spy XX has been detected 
and eliminated_” (where XX is the spy’s ID), decrements the spy 
counter and prints on the screen the total number of spies so far.
* A main method in which several objects of class Spy are created 
and some of them killed (their method **die()** is called).

Observe how the static variable is accessed by different objects both 
to increment and to decrement it