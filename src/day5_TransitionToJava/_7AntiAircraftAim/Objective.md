## Anti-aircraft aim (*)
Create an enumerated type Result in its own file. The enum must have 8 possible values: HIT, FAIL
LEFT, FAIL RIGHT, FAIL HIGH, FAIL LOW, FAIL SHORT, FAIL LONG, OUT OF RANGE. _Hint: the enum must be
public_ Then create a Java class Target with the following methods:

- A constructor method **Target(int)** that creates a 3-D array of integers of the proposed size 
in all three dimensions. All elements must be set to zero.
- A method called **init()** that sets all the elements in the matrix to 0 except one —selected 
randomly— that will be set to 1. _Hint: Remember that you can get a random integer be
tween 0 and N (not including N) by using int numberToGuess = (int) Math.abs(N * Math.random())_
- fire(int,int,int) a method that checks whether the element determined by the indexes is 1 and 
returns a type Result according to the result: Result.HIT if the element is 1, Result.FAIL_LEFT
if the element of value one is “to the left” (you must decide what left and right are in your 
3-D array), etc. If any of the indeces is too big (or negative), the method must return
Result.OUT\_OF\_RANGE Left–right information takes precedence over high–low, and this takes 
precendence over short–long. If the 1 is to the left and behind, the output should be 
Result.FAIL\_LEFT

Write a small program that tells the user they must hit a flying target , and then let the user 
try to find it by introducing three indeces. The program should use an object of class Target
to know whether the user hit or not, and provide feedback accordingly. Here is a sample out of 
such a program in a space 10x10x10.

- Here they come! Try to bring the plane down!
- Enter a coordinate X: 30
- Enter a coordinate Y: 4
- Enter a coordinate Z: 5
- That shot is way out of range. Try harder!
- Enter a coordinate X: 3
- Enter a coordinate Y: 4
- Enter a coordinate Z: 5
- You missed! The target is to the right!
- Enter a coordinate X: 5
- Enter a coordinate Y: 4
- Enter a coordinate Z: 1
- You missed! The target is farther!
- Enter a coordinate X: 5
- Enter a coordinate Y: 4
- Enter a coordinate Z: 5
- You hit it! Well done!
- Would you like to play again? y
- Here they come! Try to bring the plane down!
- Enter a coordinate X: