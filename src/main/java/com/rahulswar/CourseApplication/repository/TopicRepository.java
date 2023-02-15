package com.rahulswar.CourseApplication.repository;

import com.rahulswar.CourseApplication.model.Topic;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TopicRepository extends MongoRepository<Topic, Long> {
    //in-built CRUD methods extended from MongoRepository
}
