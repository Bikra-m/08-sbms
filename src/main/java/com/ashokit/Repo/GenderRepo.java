package com.ashokit.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.Entity.Gender;

public interface GenderRepo extends JpaRepository<Gender, Serializable>{

}
