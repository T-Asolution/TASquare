package com.tasolution.tasquare.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="project")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id")
	private int projectId;

	@Column(name = "project_name")
	private String projectName;
	
	@Column(name = "description")
	private String description;

	@OneToMany
    private List<Version> version;

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	@OneToMany
    private List<Member> member;
	
	@OneToMany
    private List<Ticket> ticket;

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Version> getVersion() {
		return version;
	}

	public void setVersion(List<Version> version) {
		this.version = version;
	}
	
	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}
}
