package com.app.assignment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.assignment.model.Comment;
import com.app.assignment.model.Story;
import com.app.assignment.service.AppService;
import com.app.assignment.service.CommentService;
import com.app.assignment.service.StoryService;

@Service
public class AppServiceImpl implements AppService {

	@Autowired
	StoryService storyService;
	
	@Autowired
	CommentService commentService;
	
	@Override
	public List<Comment> getComments(int storyId) {
		return commentService.getComments(storyId);
	}

	@Override
	public List<Story> getTopStories() {
		return storyService.getTopStories();
	}

	@Override
	public List<Story> getPastStories() {
		return null;
	}

}