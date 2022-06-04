public class CreditPaymentService {
    public int calculate(int creditAmount, double interestRate, int creditPeriodYear) {

        int monthlyPayment;
        double doubleMonthlyPayment;


        int creditPeriodMonth = creditPeriodYear * 12;
        double percentInMonth = interestRate / 100 / 12;
        double multiplayer1 = 1 + percentInMonth;
        double multiplayer2 = multiplayer1;

        for (int i = 0; i < creditPeriodMonth - 1; i++) {
            multiplayer2 = multiplayer2 * multiplayer1;
        }
        double multiplayer3 = 1 - 1 / multiplayer2;
        doubleMonthlyPayment = creditAmount * percentInMonth / multiplayer3;
        monthlyPayment = (int) doubleMonthlyPayment;


        return monthlyPayment;
    }
}
