package ru.mvkos.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.mvkos.numberutils.FibonacchiNumber;

public class TestRunner {
    FibonacchiNumber number = new FibonacchiNumber();

    @Test
    public void fibonacchiSeq(){
       int currentNumber =  number.getFibonacciSum();
        Assertions.assertNotNull(currentNumber);
    }
}
