package com.rahulswar.CourseApplication.repository;

import com.rahulswar.CourseApplication.model.Course;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface CourseRepository extends MongoRepository<Course, Long> {
    public List<Course> findByTopicTopicId(long id);
}
