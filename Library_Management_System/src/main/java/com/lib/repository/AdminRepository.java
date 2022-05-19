package com.lib.repository;

import org.springframework.data.repository.CrudRepository;

import com.lib.model.Admin;

public interface AdminRepository extends CrudRepository<Admin, Integer> {

}