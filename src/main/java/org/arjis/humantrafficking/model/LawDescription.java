package org.arjis.humantrafficking.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class LawDescription {


	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	 //@Column(name="LAW")
	private String law;
	
	//@Column(name="SUMMARY")
	private String summary;
	
	//@Column(name="RESOURCELINK")
	private String resourceLink;
	

	
	
	public long  getId() {
		return id;
	}
	public void setId(long  id) {
		this.id = id;
	}
	
	public String getLaw() {
		return law;
	}

	public void setLaw(String law) {
		this.law = law;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getResourceLink() {
		return resourceLink;
	}
	public void setResourceLink(String resourceLink) {
		this.resourceLink = resourceLink;
	}
	
	
}
