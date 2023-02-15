package com.rahulswar.CourseApplication.controller;

import com.rahulswar.CourseApplication.model.Course;
import com.rahulswar.CourseApplication.model.Topic;
import com.rahulswar.CourseApplication.service.CourseService;
import com.rahulswar.CourseApplication.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @GetMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable long id) {
        return courseService.getAllCourses(id);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable long id){
        return courseService.getCourse(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public Course createCourse(@PathVariable long topicId, @RequestBody Course course) {
        Topic topic = new Topic(topicId, "", "");
        course.setTopic(topic);
        courseService.createCourse(course);
        return course;
    }

    @PutMapping("/topics/{topicId}/courses/{courseId}")
    public Optional<Course> updateCourse(@PathVariable long topicId,@PathVariable long courseId, @RequestBody Course course){
        Topic topic = new Topic(topicId, "", "");
        course.setTopic(topic);
        courseService.updateCourse(course);
        return courseService.getCourse(courseId);
    }

    @DeleteMapping("/topics/{topicId}/courses/{courseId}")
    public Optional<Course> deleteCourse(@PathVariable long courseId){
        Optional<Course> deleted = courseService.getCourse(courseId);
        courseService.deleteCourse(courseId);
        return deleted;
    }
}
