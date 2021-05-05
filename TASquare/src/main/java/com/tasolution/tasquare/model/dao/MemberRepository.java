package com.tasolution.tasquare.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasolution.tasquare.model.entity.Member;

public interface MemberRepository extends JpaRepository<Member, Integer>  {

}
