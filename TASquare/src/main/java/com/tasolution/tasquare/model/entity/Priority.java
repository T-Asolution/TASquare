package com.tasolution.tasquare.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Priority {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "priority_id")
	private int priorityId;

	@Column(name = "priority_type")
	private String priorityType;

	public int getPriorityId() {
		return priorityId;
	}

	public void setPriorityId(int priorityId) {
		this.priorityId = priorityId;
	}

	public String getPriorityType() {
		return priorityType;
	}

	public void setPriorityType(String priorityType) {
		this.priorityType = priorityType;
	}
}
