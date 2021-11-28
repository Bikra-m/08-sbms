package com.ashokit.Repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.Entity.Timing;

public interface TimingRepo extends JpaRepository<Timing, Serializable>{

}
