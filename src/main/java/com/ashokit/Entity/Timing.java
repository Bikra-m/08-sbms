package com.ashokit.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="timing_dtl")
public class Timing {

	@Id
	private Integer timingid;
	private String timingname;
	
	
	public Integer getTimingid() {
		return timingid;
	}
	public void setTimingid(Integer timingid) {
		this.timingid = timingid;
	}
	public String getTimingname() {
		return timingname;
	}
	public void setTimingname(String timingname) {
		this.timingname = timingname;
	}	
}
