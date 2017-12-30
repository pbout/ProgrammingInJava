package Day2_VersionControl._12NumberPyramids;

public class Run {
    public static void main(String[] args) {
        Run run = new Run();
        run.start();
    }

    public void start(){
        int j = 9;
        int k = 15;

        for (int i = 0; i <= j; i++){
            System.out.println(times(String.valueOf(i),i));
        }

        for (int i = 0; i <= k; i++){
            if (i < 10){
                String inc = times(String.valueOf(i),1);
                System.out.println(times(" ",k*2-i*2) + times(inc,i));
            }else{
                System.out.println(times(" ",k*2-i*2) + times(String.valueOf(i),i));
            }

        }
    }

    private String times(String input, int times){
        String result = "";
        for (int i = 0; i <= times; i++){
            result = result + input;
        }
        return result;
    }
}
