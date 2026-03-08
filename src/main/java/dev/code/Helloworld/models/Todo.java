package dev.code.Helloworld.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity

public class Todo {
    @Id
    @GeneratedValue
    Long id;
    String Title;
    String Description;
    Boolean isCompleted;
}
