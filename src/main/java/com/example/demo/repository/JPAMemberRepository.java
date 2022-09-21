package com.example.demo.repository;

import com.example.demo.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JPAMemberRepository extends JpaRepository<Member, Long> {
    Member findById(String username);

    List<Member> findByUsername(String username);

}