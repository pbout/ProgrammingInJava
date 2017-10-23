# 12. Cocktail sort (*)
Cocktail sort is a combination of two bubble sorts. First the list is 
traversed in one direction to move the highest element to the end, 
and then it is traversed in the opposite direction to move the 
lowest element to the beginning. 

This bidirectional process is 
repeated until there are no swaps in the list, which shows that 
the list is sorted. Implement cocktail sort in a static method in 
a class, maybe ListUtilities.cocktailSort(List). The name of the 
algorithm comes from a metaphorical cocktail shaker moving up and 
down, up and down... 

Try your method with the same lists as bubble 
sort and see how long it takes to sort them.