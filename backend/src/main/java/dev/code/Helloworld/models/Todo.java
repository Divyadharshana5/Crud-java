package dev.code.Helloworld.models;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "todos")
public class Todo {

    @Id
    private String id;

    @NotBlank
    @Schema(name = "title", example = "Complete Spring Boot")
    private String title;

    private Boolean completed;

}