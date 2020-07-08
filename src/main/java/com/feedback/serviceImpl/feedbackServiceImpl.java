package com.feedback.serviceImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feedback.dao.FeedbackDAO;
import com.feedback.model.Feedback;
import com.feedback.service.feedbackService;

@Service
public class feedbackServiceImpl implements feedbackService{
	
	@Autowired
	private FeedbackDAO dao;

	@Override
	public Feedback createFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return dao.save(feedback);
	}

	@Override
	public Feedback updateFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return dao.save(feedback);
	}

	@Override
	public Feedback getFeedbackUserId(int userId) {
		
		return dao.findById(userId).get();
	}

	@Override
	public List<Feedback> getAllFeedbacks() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Feedback> getFeedbackName(String userName) {
		// TODO Auto-generated method stub
		return dao.findByUserName(userName);
	}

	@Override
	public void deleteFeedbackId(int userId) {
		// TODO Auto-generated method stub
		dao.deleteById(userId);
	}
	

}
