package com.neu.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neu.beans.Lesson;
import com.neu.service.FrontLessonService;

@Controller
public class FrontLessonHandler {

	@Autowired
	FrontLessonService lessonService;
	
	@RequestMapping(value="/front/findLessons")
	@ResponseBody
	public Map<String, List<Lesson>> findLessons() throws Exception{
		return lessonService.findLessonListByCategory();
	}
	
	@RequestMapping(value = "/front/findLessonById")
	@ResponseBody
	public Lesson findLessonById(int lid){
		System.out.println("..........FrontLessonHandler.....findLessonById");
		Lesson lesson = lessonService.findLessonById(lid);
		return lesson;
	}
}