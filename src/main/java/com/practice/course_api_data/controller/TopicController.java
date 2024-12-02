package com.practice.course_api_data.controller;

import com.practice.course_api_data.entity.Topic;
import com.practice.course_api_data.service.TopicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topics")
public class TopicController {
    private final TopicService topicService;

    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }


    @GetMapping
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    // Using Request Param
    @GetMapping("/topic")
    public Topic getTopicById(@RequestParam int id) {
        return topicService.getTopicById(id);

    }

    @PostMapping
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic(topic);
    }


    @PostMapping("/addAllTopics")
    public void addAllTopics(@RequestBody List<Topic> topicList) {
        topicService.addAllTopics(topicList);
    }

    @PutMapping
    public void updateTopic(@RequestBody Topic topic) {
        topicService.updateTopic(topic);
    }

    @DeleteMapping
    public void deleteTopicById(@RequestParam int id) {
        topicService.deleteTopic(id);
    }
}
