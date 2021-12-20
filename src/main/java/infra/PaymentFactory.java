package infra;

import domain.model.Payment;
import domain.model.PaymentId;
import domain.model.Member;

public final class PaymentFactory {

    public static Payment createInitialPayment(PaymentId id, Member member) {
        return Payment.of(id, member);
    }
}
