import java.util.Scanner;

public class DepositCalculator {

    double calculateComplexPercentFunction(double amount, int period) {
       double pay = amount * Math.pow((1 + 0.06 / 12), 12 *period);
          return round(pay);
  }
    double calculateSimplePercentFunction(double doubleAmount, int depositPeriod) {
         return round(doubleAmount+doubleAmount * 0.06 *depositPeriod);
    }
    double round(double value) {
       double ScaLe= Math.pow(10, 2);
       return Math.round(value*ScaLe)/ScaLe; }

    void calculateDeposit() {
      int period;
      int action ;
      Scanner userInput = new Scanner(System.in);
      System.out.println("Введите сумму вклада в рублях:");
      int amount = userInput.nextInt();
      System.out.println("Введите срок вклада в годах:");
      period = userInput.nextInt();
      System.out.println("Выберите тип вклада, 1 - вклад с обычным процентом, 2 - вклад с капитализацией:");
      action = userInput.nextInt();
      double resultDeposit = 0;
          if (action == 1)
              resultDeposit = calculateSimplePercentFunction(amount, period);
          else if (action == 2) {
              resultDeposit = calculateComplexPercentFunction(amount, period);
        }
       System.out.println("Результат вклада: " + amount + " за " + period + " лет превратятся в " + resultDeposit);
    }
    public static void main(String[] args) {
        new DepositCalculator().calculateDeposit();
    }



}
