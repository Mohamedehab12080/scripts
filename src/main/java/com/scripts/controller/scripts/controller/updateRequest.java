package com.scripts.controller.scripts.controller;

import com.scripts.controller.scripts.DTO.userDto;

public class updateRequest {

	private userDto user;
	private Long userId;
	public userDto getUser() {
		return user;
	}
	public void setUser(userDto user) {
		this.user = user;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	
}
