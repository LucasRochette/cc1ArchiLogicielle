import domain.model.Payment;
import domain.repository.PaymentRepository;
import domain.model.PaymentService;
import domain.model.Member;
import infra.InMemoryMemberRepository;
import infra.InMemoryPaymentRepository;
import infra.PaymentFactory;
import domain.repository.MemberRepository;
import domain.model.RegistrationService;
import infra.MemberFactory;

import java.io.InvalidObjectException;

public class App {
    public static void main(String[] args) throws InvalidObjectException {
        MemberRepository memberRepository = new InMemoryMemberRepository();
        RegistrationService registrationService = new RegistrationService(memberRepository);
        Member member = MemberFactory.create(
                memberRepository.nextIdentity(),
                "John",
                "Doe",
                "JohnDoe@test.com");
        registrationService.registerMember(member);

        PaymentRepository paymentRepository = new InMemoryPaymentRepository();
        PaymentService paymentService = new PaymentService(paymentRepository, memberRepository);
        Payment payment = PaymentFactory.createInitialPayment(
                paymentRepository.nextIdentity(),
                member
        );
        paymentService.processPayment(payment);
    }
}
