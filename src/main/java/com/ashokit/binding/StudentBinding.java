package com.ashokit.binding;

public class StudentBinding {
	
	private String name;
	private String email;
	private Long phno;
	private String gender;
	private String course;
	private String timing;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getTiming() {
		return timing;
	}
	public void setTiming(String timing) {
		this.timing = timing;
	}
	@Override
	public String toString() {
		return "StudentBinding [name=" + name + ", email=" + email + ", phno=" + phno + ", gender=" + gender
				+ ", course=" + course + ", timing=" + timing + "]";
	}
}
