package com.ashokit.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="gender_dtl")
public class Gender {
	
	@Id
	private Integer genderid;
	private String gendername;
	
	
	public Integer getGenderid() {
		return genderid;
	}
	public void setGenderid(Integer genderid) {
		this.genderid = genderid;
	}
	public String getGendername() {
		return gendername;
	}
	public void setGendername(String gendername) {
		this.gendername = gendername;
	}
}
