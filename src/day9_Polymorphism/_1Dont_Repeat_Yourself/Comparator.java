package day9_Polymorphism._1_Dont_Repeat_Yourself;

public class Comparator {
    /*
    public int calc(int n, int m) {
        if (n > m) {
            return n;
        } else {
            return m;
        }
    }

    public double getMax(double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }

    public String getMax(String number1, String number2) {
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        if (n1 > n2) {
            return number1;
        } else {
            return number2;
        }
    }
    */

    public Object getMax(Object s, Object j){
        int n1 = 0;
        int n2 = 0;
        if (s.getClass() == Integer.class) {
            n1=(int)s;
            n2=(int)j;
        }else if(s.getClass() == String.class){
            n1=Integer.parseInt(s.toString());
            n2=Integer.parseInt(j.toString());
        }else if(s.getClass() == Double.class){
            n1=(int)Double.parseDouble(s.toString());
            n2=(int)Double.parseDouble(j.toString());
        }

        if (n1 > n2) {
            return s;
        } else {
            return j;
        }
    }

}
