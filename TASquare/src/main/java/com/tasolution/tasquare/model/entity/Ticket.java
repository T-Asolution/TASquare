package com.tasolution.tasquare.model.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private int ticketId;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "regist_date")
	private Date registDate;
	
	@Column(name = "update_date")
	private Date updateDate;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "estimated_hours")
	private int estimatedHours;
	
	@ManyToOne
	private Tracker tracker;
	
	@ManyToOne
	private Project project;
	
	@ManyToOne
	private Status status;
	
	@ManyToOne
	private UserInfo user_info1;
	
	@ManyToOne
	private Priority priority;
	
	@ManyToOne
	private Version version;
	
	@ManyToOne
	private UserInfo user_info2;

	public int getTicketId() {
		return ticketId;
	}

	public void setTicketId(int ticketId) {
		this.ticketId = ticketId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public int getEstimatedHours() {
		return estimatedHours;
	}

	public void setEstimatedHours(int estimatedHours) {
		this.estimatedHours = estimatedHours;
	}

	public Tracker getTracker() {
		return tracker;
	}

	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public UserInfo getUser_info1() {
		return user_info1;
	}

	public void setUser_info1(UserInfo user_info1) {
		this.user_info1 = user_info1;
	}

	public Priority getPriority() {
		return priority;
	}

	public void setPriority(Priority priority) {
		this.priority = priority;
	}

	public Version getVersion() {
		return version;
	}

	public void setVersion(Version version) {
		this.version = version;
	}

	public UserInfo getUser_info2() {
		return user_info2;
	}

	public void setUser_info2(UserInfo user_info2) {
		this.user_info2 = user_info2;
	}

	
}
