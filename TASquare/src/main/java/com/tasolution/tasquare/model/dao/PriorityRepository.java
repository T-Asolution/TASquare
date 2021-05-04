package com.tasolution.tasquare.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasolution.tasquare.model.entity.Priority;

public interface PriorityRepository extends JpaRepository<Priority, Integer> {

}
