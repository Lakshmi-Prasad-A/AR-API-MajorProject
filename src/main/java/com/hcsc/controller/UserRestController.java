package com.hcsc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hcsc.entity.UserRegistration;
import com.hcsc.serviceImpl.UserRegInter;

@RestController
public class UserRestController {

	@Autowired
	private UserRegInter userRegInter;

	@PostMapping("/save")
	public String userSave(@RequestBody UserRegistration userRegistration) {
		return userRegInter.userRegistration(userRegistration);
	}
}
