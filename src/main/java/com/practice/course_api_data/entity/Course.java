package com.practice.course_api_data.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Course {
    private int id;
    private String name;
    private String description;
    private Topic topic;

}
