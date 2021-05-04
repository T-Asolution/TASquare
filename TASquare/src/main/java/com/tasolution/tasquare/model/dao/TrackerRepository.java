package com.tasolution.tasquare.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tasolution.tasquare.model.entity.Tracker;

public interface TrackerRepository extends JpaRepository<Tracker, Integer> {

}
