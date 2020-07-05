package com.lyes.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

	
	@GetMapping(path="/")
	public @ResponseBody String welcome() {
		return "<h1>welcome</h1>";
	}
	
	@GetMapping(path="/admin")
	public @ResponseBody String admin() {
		return "<h1>welcome admin</h1>";
	}
	
	@GetMapping(path="/user")
	public @ResponseBody String user() {
		return "<h1>welcome user</h1>";
	}
	
	
}
