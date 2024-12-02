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

//    // Using same Path Variable name
//    @GetMapping("/{id}")
//    public Topic getTopicByIdUsingSamePathVariable(@PathVariable Integer id) {
//        // Path Variable generally match by name, if the name is different, we can provide the path variable name
//        return topicService.getTopicById(id);
//
//    }
//
//    // Using Different Path Variable name
//    @GetMapping("/{topicId}")
//    public Topic getTopicByIdUsingDiffPathVariable(@PathVariable("topicId") Integer id) {
//        // Path Variable generally match by name, if the name is different, we can provide the path variable name
//        return topicService.getTopicById(id);
//
//    }

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
