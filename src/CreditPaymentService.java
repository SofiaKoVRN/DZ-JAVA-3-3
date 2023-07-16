public class CreditPaymentService {
    public int calculate(int sum, int term, double bid) {
        double payment;
        payment = (int) ((sum * bid * Math.pow((1 + bid), term * 12)) / (Math.pow((1 + bid), term * 12) - 1));

        return (int) payment;
    }
}
