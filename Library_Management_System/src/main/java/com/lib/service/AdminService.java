package com.lib.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lib.model.Admin;
import com.lib.repository.AdminRepositoryImpl;

@Service
public class AdminService {
	
	@Autowired
	AdminRepositoryImpl adminRepositoryImpl;
	
	public boolean validateAdmin(String adminId, String password) {
		boolean status = false;
		ArrayList<Admin> admins = (ArrayList<Admin>) adminRepositoryImpl.getAllAdmins();
		for(Admin admin : admins) {
			if (admin.getAdminid().equals(adminId) && admin.getPassword().equals(password))
				status = true;
			
		}
		return status;
		
	}

}