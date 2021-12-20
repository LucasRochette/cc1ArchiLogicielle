package domain.repository;

import domain.model.Member;
import domain.model.MemberId;

import java.util.Optional;

public interface MemberRepository {

    MemberId nextIdentity();
    Member findById(MemberId id);
    Optional<Member> findById(String email);
    void save(Member member);
}
