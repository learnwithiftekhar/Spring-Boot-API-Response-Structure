package com.learnwithifte.apiResponses;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseEntity<ApiResponse> getUser() {
        User user = new User("John", "Doe", "john@doe.com");
        ApiResponse<User> response = new ApiResponse<>(
                "success",
                "User retrived successfully",
                user,
                null
        );
        return ResponseEntity.ok(response);
    }
}
