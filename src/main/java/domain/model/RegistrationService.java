package domain.model;

import domain.repository.MemberRepository;

public record RegistrationService(MemberRepository memberRepository) {
    public void registerMember(Member member) {
        this.memberRepository.save(member);
    }
}
