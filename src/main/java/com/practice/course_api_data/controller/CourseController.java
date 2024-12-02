package com.practice.course_api_data.controller;

import com.practice.course_api_data.entity.Course;
import com.practice.course_api_data.entity.Topic;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @GetMapping
    public List<Course> getAllCoursesForTopic (@RequestParam(required = false) String topic ) {
        Topic java = new Topic("Java", "Java Programming");
        return List.of(new Course("JavaBrains", "by Java Brains Guy",java));
    }
}
