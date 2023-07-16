public class main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService ();
        int sum = 1_000_000; // сумма кредита
        int term = 2; // срок в годах
        double bid = 0.008325f; // ежемесячная ставка
        double payment;
        payment = service.calculate(sum, term, bid);

        System.out.println(payment);

    }
}
