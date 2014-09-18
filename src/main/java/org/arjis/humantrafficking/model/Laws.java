package org.arjis.humantrafficking.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Laws")
public class Laws {

	/*
	public int  getId() {
		return id;
	}

	public void setId(int  id) {
		this.id = id;
	}





	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int  id;
	
	
	private String stateOrFed;

	@OneToMany(cascade=javax.persistence.CascadeType.ALL)
	@JoinTable(name="LAw_LAWDESC", joinColumns=@JoinColumn(name="LawId"), inverseJoinColumns=@JoinColumn(name="LawDesc_Id"))
	private Set<LawDescription> lawDesc = new HashSet<LawDescription>();

	public Set<LawDescription> getLawDesc() {
		return lawDesc;
	}

	public void setLawDesc(Set<LawDescription> lawDesc) {
		this.lawDesc = lawDesc;
	}

	public String getStateOrFed() {
		return stateOrFed;
	}

	public void setStateOrFed(String stateOrFed) {
		this.stateOrFed = stateOrFed;
	}
	
	*/
	
	
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	 //@Column(name="LAW")
	private String name;
	
	
	private String type;
	
	private String status;

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	//@Column(name="SUMMARY")
	private String summary;
	
	//@Column(name="RESOURCELINK")
	private String resourceLink;
	

	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public int  getId() {
		return id;
	}
	public void setId(int  id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String law) {
		this.name = law;
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
