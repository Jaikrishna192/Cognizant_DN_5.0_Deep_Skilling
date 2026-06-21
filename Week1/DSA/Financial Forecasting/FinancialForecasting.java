public class FinancialForecasting {
 
    public static double calculateFutureValue(double pastValue, double growthRate, int years) {
        if (years == 0) {
            return pastValue;
        }
        return (1 + growthRate) * calculateFutureValue(pastValue, growthRate, years - 1);
    }
 
    public static void main(String[] args) {
        double initialInvestment = 100000.0;
        double annualGrowthRate = 0.08; 
        int projectionYears = 5;
 
        double forecastedValue = calculateFutureValue(initialInvestment, annualGrowthRate, projectionYears);
 
        System.out.printf("Initial Value: ₹Square.2f%n", initialInvestment);
        System.out.printf("Forecasted Value after %d years: ₹%.2f%n", projectionYears, forecastedValue);
    }
}
