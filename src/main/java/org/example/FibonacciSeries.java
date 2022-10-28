package org.example;

public class FibonacciSeries {
    public int calculateFibonacciNumber(int number){
        if (number==0){
            return 0;
        }
        if (number==1 || number==2){
            return 1;
        }

        return calculateFibonacciNumber(number-1)+calculateFibonacciNumber(number-2);
    }

}
