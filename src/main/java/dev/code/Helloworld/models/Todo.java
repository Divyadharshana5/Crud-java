package dev.code.Helloworld.models;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data
public class Todo {
    @jakarta.persistence.Id
    private Long id1;
    @Id
    @GeneratedValue
    Long id;
    @NotBlank
    @Schema(name="title",example="Complete Spring Boot")
    String Title;
    Boolean isCompleted;
}
