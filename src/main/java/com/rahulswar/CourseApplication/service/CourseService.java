package com.rahulswar.CourseApplication.service;

import com.rahulswar.CourseApplication.model.Course;
import com.rahulswar.CourseApplication.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourses(long id) {
        return courseRepository.findByTopicTopicId(id);
    }

    public Optional<Course> getCourse(long id){
        return courseRepository.findById(id);
    }

    public void createCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course){
        courseRepository.save(course);
    }

    public void deleteCourse(long id) {
        courseRepository.deleteById(id);
    }
}
