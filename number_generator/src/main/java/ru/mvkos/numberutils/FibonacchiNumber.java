package ru.mvkos.numberutils;
import java.time.LocalDate;

public class FibonacchiNumber {

    private LocalDate currentDate;
    private int fibonacciSum;

    private void calculateFibonacchiNumber(){
        int dayOfMonth = this.currentDate.getDayOfMonth();
        int currentNumber = 0;
        int previousNumber = 0;
        for(int i = 0; i <= dayOfMonth; i++){
            int resultNumber = currentNumber + previousNumber;
            previousNumber = currentNumber;
            currentNumber = resultNumber;
        }

        this.fibonacciSum = currentNumber;
    }

    public FibonacchiNumber(){
        this.currentDate = LocalDate.now();
        calculateFibonacchiNumber();
    }

    public int getFibonacciSum() {
        calculateFibonacchiNumber();
        return this.fibonacciSum;
    }
}
