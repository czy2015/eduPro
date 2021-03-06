package com.neu.controller;

import com.neu.beans.Lesson;
import com.neu.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DemoHandler {

    @Autowired
    DemoService demoService;

    @RequestMapping(value = "/test/findLessons")
    @ResponseBody
    public List<Lesson> findLessons() {
        System.out.println("..........DemoHandler............findLessons..");
        return demoService.findLessons();
    }
    
    @RequestMapping(value="/test/lessonType")
    @ResponseBody
    public List<String> findLessonType(){
    	System.out.println("........DemoHandler.......findLessonType.");
    	return demoService.findlessonType();
    }
}
