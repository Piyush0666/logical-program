public class FibonacciSeries {
    public static void main(String[] args){
        System.out.println("program of fibonacci Series;");

        int n1 = 0;
        int n2 =1;
        int n3;
        for (int i =0;i<=10;i++){
            n3 =n1 +n2;
            System.out.println(n3);
            n1 = n2;
            n2 =n3;
        }

        }

    }
