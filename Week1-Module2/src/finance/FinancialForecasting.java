
package finance;
public class FinancialForecasting {

    // Recursive method to calculate future value
    public static double calculateFutureValue(double presentValue, double growthRate, int years) {
        // Base case: If the number of years is 0, return the present value
        if (years == 0) {
            return presentValue;
        }
        
        // Recursive case: Multiply the present value by (1 + growth rate) and call the method for the next year
        return calculateFutureValue(presentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double presentValue = 1000;  // Example: starting with $1000
        double growthRate = 0.05;    // Example: 5% growth rate
        int years = 10;              // Example: forecasting for 10 years

        double futureValue = calculateFutureValue(presentValue, growthRate, years);
        System.out.println("The future value after " + years + " years is: $" + futureValue);
    }
}
