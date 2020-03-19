//Elena Voinu
import java.util.Arrays;

public class MemoizationFibonacci {
    int size;
    private int[] array;
    private int capacity;

    MemoizationFibonacci(int capacity){
        this.size=size;
        this.capacity=capacity;
        array = new int[capacity];
    }
//method that calculates the fib number
    int fibNum(int num){
        //base cases
        if(num==0){
            return 0;
        }
        else if (num ==1){
            return 1;
        }
        else if (array[num]==0){
         array[num] = fibNum(num-1) + fibNum(num-2);
        }
       return array[num];
    }
    
  // void method to calculate  the nth fib number 
  //  void fib(int[] array, int num){
  //      if(num<=0){
  //          System.out.println("fib of "+ num+ "= "+0);
  //      }
  //      else if (num ==1){
  //          System.out.println("fib of "+ num+ "= "+1);
  //      }
  //      else if(array[num]==0){
  //          array[num] = fibNum(num-1) + fibNum(num-2);
  //      }
   //     System.out.println("Fib of " + num+ " = "+array[num]);

   // }

    //print the result
    public void display(){
        for(int i = 0; i < array.length; i++){
           // System.out.println(array[i]);
        }
        System.out.println(Arrays.toString(array));
    }
}
