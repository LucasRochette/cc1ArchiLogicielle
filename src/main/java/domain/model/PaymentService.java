package domain.model;

import domain.repository.MemberRepository;
import domain.repository.PaymentRepository;

import java.io.InvalidObjectException;

public record PaymentService(PaymentRepository paymentRepository,
                             MemberRepository memberRepository) {

    public void processPayment(Payment payment) throws InvalidObjectException {
        Member member = payment.getMember();

        if (member.getId() == null) {
            throw new InvalidObjectException("Invalid payer");
        }

        if (payment.getId() == null) {
            throw new InvalidObjectException("Invalid payer");
        }

        System.out.println("Successful payment");
    }
}
