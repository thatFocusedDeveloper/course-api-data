package com.practice.course_api_data.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String description;
    @OneToOne
    private Topic topic;

    public Course(String name, String description, Topic topic) {
        this.name = name;
        this.description = description;
        this.topic = topic;
    }
}
