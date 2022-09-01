package com.zensar.im.entities;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="adminManagement")
public class AdminEntity {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
      private String name;
      private String primarySkills;
      private String secondarySkills;
      private int experience;
      private String qualification;
      private String designation;
      private int noticePeriodInweeks;
      private String location;
      
      
	
	
	@Override
	public String toString() {
		return "AdminEntity [id=" + id + ", name=" + name + ", primarySkills=" + primarySkills + ", secondarySkills="
				+ secondarySkills + ", experience=" + experience + ", qualification=" + qualification + ", designation="
				+ designation + ", noticePeriodInweeks=" + noticePeriodInweeks + ", location=" + location + "]";
	}
	public AdminEntity(int id, String name, String primarySkills, String secondarySkills, int experience,
			String qualification, String designation, int noticePeriodInweeks, String location) {
		super();
		this.id = id;
		this.name = name;
		this.primarySkills = primarySkills;
		this.secondarySkills = secondarySkills;
		this.experience = experience;
		this.qualification = qualification;
		this.designation = designation;
		this.noticePeriodInweeks = noticePeriodInweeks;
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSecondarySkills() {
		return secondarySkills;
	}
	public void setSecondarySkills(String secondarySkills) {
		this.secondarySkills = secondarySkills;
	}
	public AdminEntity() {
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrimarySkills() {
		return primarySkills;
	}
	public void setPrimarySkills(String primarySkills) {
		this.primarySkills = primarySkills;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getNoticePeriodInweeks() {
		return noticePeriodInweeks;
	}
	public void setNoticePeriodInweeks(int noticePeriodInweeks) {
		this.noticePeriodInweeks = noticePeriodInweeks;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
      
      
}
