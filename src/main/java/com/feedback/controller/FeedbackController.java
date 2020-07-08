package com.feedback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.feedback.model.Feedback;
import com.feedback.service.feedbackService;

@RestController
public class FeedbackController {
	
	@Autowired
	private feedbackService service;
	private MultiValueMap<String, String> map;
	@PostMapping("/feedback")
	
	public Feedback createFeedback(@RequestBody Feedback feedback) {
		
		return service.createFeedback(feedback);
	}

	@PutMapping("/feedback")
	public Feedback updateFeedback(@RequestBody Feedback feedback) {
		
		return service.updateFeedback(feedback);
	}

	@GetMapping("/feedback/{userId}")
	public Feedback getFeedbackUserIdFeedback(@PathVariable ("userId") int userId) {
		
		return service.getFeedbackUserId(userId);
		
	}

	@GetMapping("/feedbacks")
	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return service.getAllFeedbacks();
	}

	@GetMapping("/feedbacks/userName/{userName}")
	public List<Feedback> getFeedbackName(String userName) {
		// TODO Auto-generated method stub
		return service.getFeedbackName(userName);
	}

	@DeleteMapping("/feedback/{userId}")
	public void deleteFeedbackId(@PathVariable ("userId") int userId) {
		
			service.deleteFeedbackId(userId);
		
	}
	
	

}
