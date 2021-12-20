package infra;

import domain.model.Member;
import domain.model.MemberId;
import domain.repository.MemberRepository;


import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class MemberFactory implements MemberRepository {

    private static final String EMAIL_PATTERN = "^(.+)@(\\S+)$";
    private static final Pattern pattern = Pattern.compile(EMAIL_PATTERN);


    public static boolean emailIsValid(final String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public static Member create(MemberId id, String firstname, String lastname, String email) {
        Member member = Member.of(id, firstname, lastname, email);
        if(member.getFirstName().equals("") || member.getLastName().equals("")) {
            throw new IllegalArgumentException("Firstname and Lastname can't be empty");
        }
        if(!emailIsValid(member.getEmail())){
            throw new IllegalArgumentException("Invalid email");
        }
        return member;
    }

    @Override
    public MemberId nextIdentity() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Member findById(MemberId id) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Optional<Member> findById(String email) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public void save(Member member) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }


}
