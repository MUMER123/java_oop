package Static_Final;

import java.util.Arrays;

final public class MathUtils {
    private MathUtils(){

    }
    static int maxOfArr(int[] arr){
        int max = arr[0];
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        return max;
    }
    static int factorial(int num){
        int i = num-2,fact = num*(num-1);
        do{
            fact = fact*(i);
            i--;
        }while(i>0);
        return fact;
    }
    static int fact = 1;
    static int fact_rec(int num){
        if(num>0){
           fact = fact*num;
           fact_rec(num-1);
        }
        return fact;
    }
}
