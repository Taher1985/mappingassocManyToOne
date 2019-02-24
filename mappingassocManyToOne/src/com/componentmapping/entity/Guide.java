package com.componentmapping.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Guide {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "GUIDE_SEQ")
	@Column(name = "GUIDE_ID")
	private int guideId;

	@Column(name = "GUIDE_NAME")
	private String guideName;

	public Guide() {
		super();
	}

	public Guide(String guideName) {
		super();
		this.guideName = guideName;
	}

	@Override
	public String toString() {
		return "\nGuide Id: " + guideId + " and Guide Name: " + guideName;
	}

}
