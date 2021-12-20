package infra;

import domain.model.Payment;
import domain.model.PaymentId;
import domain.repository.PaymentRepository;

import java.util.List;
import java.util.Optional;

public class InMemoryPaymentRepository implements PaymentRepository {

    @Override
    public void save(Payment payment) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Optional<Payment> byId(PaymentId paymentId) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public PaymentId nextIdentity() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public List<Payment> findAll() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
}
