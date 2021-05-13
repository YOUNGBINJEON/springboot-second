package com.hello.hellospring.repository;

import com.hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    //회원이 저장소에 저장
    Member save(Member member);
    //저장소에서 회원 아이디와 이름을 찾아올 수 있다
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    // 회원 정보의 전부를 반환
    List<Member> findAll();
}
