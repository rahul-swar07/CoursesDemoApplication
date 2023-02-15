package com.rahulswar.CourseApplication.service;

import com.rahulswar.CourseApplication.model.Topic;
import com.rahulswar.CourseApplication.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        List<Topic> tlist = new ArrayList<>();
        topicRepository.findAll().forEach(tlist::add);
        return tlist;
    }

    public Optional<Topic> getTopic(long id){
        return topicRepository.findById(id);
    }

    public void createTopic(Topic topic){
        topicRepository.save(topic);
    }

    public void updateTopic(long id, Topic topic){
        topicRepository.save(topic);
    }

    public void deleteTopic(long id) {
        topicRepository.deleteById(id);
    }
}
