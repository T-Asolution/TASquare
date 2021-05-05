package com.tasolution.tasquare.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "member")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "member_id")
	private int memberId;
	
	@ManyToOne
	UserInfo userInfo;
	
	@ManyToOne
	Project project;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}
