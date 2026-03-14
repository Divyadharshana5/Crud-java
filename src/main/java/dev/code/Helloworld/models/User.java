package dev.code.Helloworld.models;

import io.swagger.v3.oas.annotations.info.Contact;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Data
@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String email;

    public static Contact builder() {
        return null;
    }
    // Add other fields for JWT/security
}
