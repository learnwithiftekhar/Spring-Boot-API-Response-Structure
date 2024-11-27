package com.learnwithifte.apiResponses;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public ResponseEntity<ApiResponse<List<User>>>  getAllUsers(
            @RequestParam int page,
            @RequestParam int size
    ) {
        User user = new User("John", "Doe", "john@doe.com");

        ApiResponse<List<User>> response = new ApiResponse<>(
                "success",
                "Users retrieved successfully",
                List.of(user),
                Map.of(
                        "currentPage", 1,
                        "totalPages", 10,
                        "totalItems", 100
                )
        );
        return ResponseEntity.ok(response);

    }
    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getUser(@PathVariable int id) {
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
