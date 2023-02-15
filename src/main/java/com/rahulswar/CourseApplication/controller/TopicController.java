package com.rahulswar.CourseApplication.controller;

import com.rahulswar.CourseApplication.model.Topic;
import com.rahulswar.CourseApplication.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable long id){
        return topicService.getTopic(id);
    }

    @PostMapping("/topics")
    public Topic createTopic(@RequestBody Topic topic) {
        topicService.createTopic(topic);
        return topic;
    }

    @PutMapping("/topics/{id}")
    public Optional<Topic> updateTopic(@PathVariable long id, @RequestBody Topic topic){
        topicService.updateTopic(id, topic);
        return topicService.getTopic(id);
    }

    @DeleteMapping("/topics/{id}")
    public Optional<Topic> deleteTopic(@PathVariable long id){
        Optional<Topic> deleted = topicService.getTopic(id);
        topicService.deleteTopic(id);
        return deleted;
    }
}
