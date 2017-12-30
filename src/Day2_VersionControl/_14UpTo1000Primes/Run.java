package Day2_VersionControl._14UpTo1000Primes;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        String result = "The first 1000 primes are: ";
        int k = 0;
        int i = 0;
        Boolean prime = true;
        while (k < 1000){
            i++;
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                }
            }
            if (prime == true){
                result = result + String.valueOf(i) + ", ";
                k++;
            } else {
                prime = true;
            }
        }

        System.out.println(result);

    }
}
