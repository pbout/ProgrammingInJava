## Extension, extension...
Create a class **OldPhone** that implements the following interface.
```
/**
* A phone makes calls
*/
public interface Phone {
    /**
    * Just print on the screen: "Calling <number>...".
    */
    void call(String number);
}
```

Now create a class **MobilePhone** that extends **OldPhone** and adds methods 
for things like **ringAlarm(String)** and **playGame(String)**. This class 
keeps a list of the last ten numbers that have been called, which can 
be printed with the method **printLastNumbers()**.

Then create a class **SmartPhone** that extends **MobilePhone** and adds methods 
for **browseWeb(String)** and **findPosition()**, the latter returning a 
(fictitious) GPS-found position. 

Create a small script called **PhoneLauncher** in which you create a 
**SmartPhone** and use all its methods, including those inherited 
from its ancestor classes. 

```
public class PhoneLauncher {
    public static void main(String[] args) {
        PhoneLauncher launcher = new PhoneLauncher();
        launcher.launch();
    }
    
    public void launch() {
        // your code creating and using SmartPhone here...
    }
}
```