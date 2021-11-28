package com.ashokit.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.Entity.Course;

public interface CourseRepo extends JpaRepository<Course, Serializable>{

}
