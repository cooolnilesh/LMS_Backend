package com.lib.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.lib.service.AdminService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping(path = "/validateAdmin/{name}/{password}", produces = "text/html")
	public boolean validateUser(@PathVariable String name, @PathVariable String password) {
		return adminService.validateAdmin(name, password);
	}

}