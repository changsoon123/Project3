package com.music.mrs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.music.mrs.command.UserVO;
import com.music.mrs.user.service.IUserService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class UserinfoController {

	@Autowired
	private IUserService service;
	
	@PostMapping("/userinfo")
	public void userinfo(@RequestBody UserVO data) {
		
		System.out.println(data.getDisplayName());
		System.out.println(data.getEmail());
		service.insert(data);
	}
	
}