package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController {

	@GetMapping("/")
	public String sayhi() {
		return "hi guys how are you";
	}
}
