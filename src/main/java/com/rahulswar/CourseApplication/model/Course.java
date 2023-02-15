package com.rahulswar.CourseApplication.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "courses")
public class Course {
    @Id
    private long courseId;
    private String courseName;
    private String courseDescription;

    private Topic topic;

    public Course(long courseId, String courseName, String courseDescription, Topic topic) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
        this.topic = topic;
    }
}
