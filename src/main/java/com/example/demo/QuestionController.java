package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.github.flashvayne.chatgpt.service.ChatgptService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/questions")
public class QuestionController {
	
	@Autowired
	private ChatgptService chatgptService;


	@GetMapping("/send")
	public String send(@RequestParam String message) {
		
		//String responseMessage = chatgptService.sendMessage(message);
		return  chatgptService.sendMessage(message);
		
	}
} 
