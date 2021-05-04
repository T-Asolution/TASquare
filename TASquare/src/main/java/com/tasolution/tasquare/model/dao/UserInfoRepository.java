package com.tasolution.tasquare.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasolution.tasquare.model.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String> {

}
