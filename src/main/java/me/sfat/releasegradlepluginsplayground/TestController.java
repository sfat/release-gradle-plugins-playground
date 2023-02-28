package me.sfat.releasegradlepluginsplayground;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/api/v1/test/endpoint")
    public ResponseEntity<TestResponseV1> testEndpoint() {
        return ResponseEntity.ok(new TestResponseV1(UUID.randomUUID().toString()));
    }

    public record TestResponseV1(String name) {

    }
}
