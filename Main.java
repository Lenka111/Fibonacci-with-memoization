import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MemoizationFibonacci mf = new MemoizationFibonacci(10);
        int []array = new int[100];
        mf.fibNum(7);

        //mf.display();
        mf.fib(array, 7);
        mf.display();


    }
    //0 1 1 2 3 5 8 13

}
