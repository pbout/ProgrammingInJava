#3. Yet another loop
What does the following piece of code do?
```
String str = System.console().readLine()
int i = Integer.parseInt(str)
while (i < 10) {
    i++;
    str = System.console().readLine()
    int j = Integer.parseInt(str)
    if (j == 0) {
        break;
    } else if (j != 1) {
        println j;
    }
}
println "finished"
```
Hint: the reserved word ```break``` exits the current loop.