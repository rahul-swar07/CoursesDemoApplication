package com.rahulswar.CourseApplication.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "topics")
public class Topic {
    @Id
    private long topicId;
    private String topicName;
    private String topicDescription;

    public Topic(long topicId, String topicName, String topicDescription) {
        this.topicId = topicId;
        this.topicName = topicName;
        this.topicDescription = topicDescription;
    }
}
