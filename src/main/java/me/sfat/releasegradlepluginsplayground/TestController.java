package me.sfat.releasegradlepluginsplayground;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/test/endpoint")
    public ResponseEntity<TestResponse> testEndpoint() {
        return ResponseEntity.ok(new TestResponse(UUID.randomUUID().toString()));
    }

    public record TestResponse(String name) {

    }
}
