package com.tasolution.tasquare.model.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

public class Version {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "version_id")
	private int versionId;

	@Column(name = "version_name")
	private String versionName;

	@ManyToOne
	Project project;

	public int getVersionId() {
		return versionId;
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
