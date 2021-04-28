package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.ArrayList;
import java.util.Optional;

public interface MemberRepository {
    // 회원가입, 아이디조회, 이름조회, 전체조회

    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    ArrayList<Member> findAll();

}
