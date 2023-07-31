import java.time.LocalDate;

public class FibonacchiNumber {

    private LocalDate currentDate;
    private int fibonacciSum;

    private void calculateFibonacchiNumber(){
        this.fibonacciSum = this.currentDate.getDayOfMonth();
    }

    public int getFibonacciSum() {
        return fibonacciSum;
    }
}
