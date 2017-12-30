package Day2_VersionControl._13AllThePrimesUpTo1000;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        String result = "";
        Boolean prime = true;
        for (int i = 1; i < 1000; i++){
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    prime = false;
                }
            }
            if (prime){
                result = result + String.valueOf(i) + ", ";
            } else {
                prime = true;
            }
        }

        System.out.println(result);
    }
}
