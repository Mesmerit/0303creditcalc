public class Main {
    public static void main(String[] args) {

        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int creditAmount;
        double interestRate;
        int creditPeriodYear;

        creditAmount = 1_000_000;
        interestRate = 9.99;
        creditPeriodYear = 1;

        int monthlyPayment1 = creditPaymentService.calculate(creditAmount, interestRate, creditPeriodYear);

        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment1 + " руб.");

        creditAmount = 1_000_000;
        interestRate = 9.99;
        creditPeriodYear = 2;

        int monthlyPayment2 = creditPaymentService.calculate(creditAmount, interestRate, creditPeriodYear);

        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment2 + " руб.");

        creditAmount = 1_000_000;
        interestRate = 9.99;
        creditPeriodYear = 3;

        int monthlyPayment3 = creditPaymentService.calculate(creditAmount, interestRate, creditPeriodYear);

        System.out.println("Ваш ежемесячный платеж составит: " + monthlyPayment3 + " руб.");


    }
}
