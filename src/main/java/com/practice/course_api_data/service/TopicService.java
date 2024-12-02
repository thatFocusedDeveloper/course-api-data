package com.practice.course_api_data.service;

import com.practice.course_api_data.entity.Topic;
import com.practice.course_api_data.repository.TopicRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private TopicRepository topicRepository;

    public TopicService(TopicRepository topicRepository) {
        this.topicRepository = topicRepository;
    }

    // Arrays.asList() retruns an Immutable List -> new ArrayList copies all the List elements and returns a Mutable List
    List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("Java", "Java Programming 2"),
            new Topic("JavaScript", "JavaScript Programming"),
            new Topic("Spring", "Spring Boot Framework")
    ));
    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Topic getTopicById(long id) {
        return topicRepository.findById(id).orElse(new Topic());
//        return  topics.stream().filter(topic -> topic.getId() == id).findFirst().orElse(new Topic());
    }

    public void addTopic (Topic newTopic) {
        topicRepository.save(newTopic);
    }

    public void addAllTopics (List<Topic> topicList) {
        topicRepository.saveAll(topicList);
    }

    public void updateTopic (Topic newTopic) {
        topicRepository.saveAndFlush(newTopic);
    }

    public void deleteTopic (long id) {
        topicRepository.deleteById(id);
    }
}
