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
