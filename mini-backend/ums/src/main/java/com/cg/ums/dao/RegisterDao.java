package com.cg.ums.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.ums.bean.Register;


@Repository

public interface RegisterDao extends JpaRepository<Register, Integer> {

	
	}
