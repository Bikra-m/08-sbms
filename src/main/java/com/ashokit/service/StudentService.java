package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.Entity.Course;
import com.ashokit.Entity.Gender;
import com.ashokit.Entity.Timing;
import com.ashokit.Repo.CourseRepo;
import com.ashokit.Repo.GenderRepo;
import com.ashokit.Repo.TimingRepo;

@Service
public class StudentService {

	@Autowired
	private GenderRepo grepo;
	@Autowired
	private CourseRepo crepo;
	@Autowired
	private TimingRepo trepo;
	
	public List<String> getCourses() {
		List<Course> findAll = crepo.findAll();

		List<String> courses = new ArrayList<>();
		findAll.forEach(course -> {
			courses.add(course.getCoursename());
		});

		return courses;
	}
	
	public List<String> getGenderName(){
		
		List<Gender> findAll = grepo.findAll();
		List<String> genders=new ArrayList<>();
		findAll.forEach(gender ->{
			genders.add(gender.getGendername());
		});		
		return genders;
	}
    public List<String> getTimingName(){
		
	    List<Timing> findAll = trepo.findAll();
		List<String> timings=new ArrayList<>();
		findAll.forEach(timing ->{
			timings.add(timing.getTimingname());
		});		
		return timings;
	}
}
