package domain.repository;

import domain.model.Payment;
import domain.model.PaymentId;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {
    void save(Payment payment);

    Optional<Payment> byId(PaymentId paymentId);

    PaymentId nextIdentity();

    List<Payment> findAll();
}
