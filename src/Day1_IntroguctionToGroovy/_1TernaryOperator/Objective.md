#1. Ternary operator
Read the following code and, without executing it first, explain what it
does.
```groovy
public class PhoneLauncher {
    int currentYear = 2012;
    print "When were you born (year)?";
    String str = System.console().readLine();
    int birthYear = Integer.parseInt(str);
    int ageAprox = currentYear - birthYear;
    String result = (ageAprox > 17) ? "" : "not ";
    println "It seems you are " + result + "an adult.";
}
```

Hint: look at section “The Ternary Operator”.
