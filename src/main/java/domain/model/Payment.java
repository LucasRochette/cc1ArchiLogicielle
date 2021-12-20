package domain.model;

public final class Payment {
    private final PaymentId id;
    private final Member member;

    private Payment(PaymentId id, Member member) {
        this.id = id;
        this.member = member;
    }

    public static Payment of(PaymentId id, Member member) {
        return new Payment(id, member);
    }

    public PaymentId getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

}
