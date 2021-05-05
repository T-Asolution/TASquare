package com.tasolution.tasquare.model.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="version")
public class Version {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "version_id")
	private int versionId;

	@Column(name = "version_name")
	private String versionName;

	@ManyToOne
	private Project project;

	@OneToMany
    private List<Ticket> ticket;

	public int getVersionId() {
		return versionId;
	}

	public List<Ticket> getTicket() {
		return ticket;
	}

	public void setTicket(List<Ticket> ticket) {
		this.ticket = ticket;
	}

	public void setVersionId(int versionId) {
		this.versionId = versionId;
	}

	public String getVersionName() {
		return versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
}
