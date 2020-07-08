package com.feedback.service;

import java.util.List;

import com.feedback.model.Feedback;

public interface feedbackService {

	public Feedback createFeedback(Feedback feedback);
	public Feedback updateFeedback(Feedback feedback);
	public Feedback getFeedbackUserId(int userId);
	public List<Feedback> getAllFeedbacks();
	public List<Feedback> getFeedbackName(String userName);
	public void deleteFeedbackId(int userId);
}