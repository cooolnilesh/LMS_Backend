package com.lib.repository;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lib.model.Admin;

@Repository
public class AdminRepositoryImpl {
	
	@Autowired
	AdminRepository adminREpository;
	
	public ArrayList<Admin> getAllAdmins() {
		return (ArrayList<Admin>) adminREpository.findAll();
	}

}