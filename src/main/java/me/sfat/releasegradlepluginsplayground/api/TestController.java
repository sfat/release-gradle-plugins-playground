package me.sfat.releasegradlepluginsplayground.api;

import me.sfat.releasegradlepluginsplayground.TestResponseV1;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/api/v1.0.0/test/endpoint")
    public ResponseEntity<TestResponseV1> testV1Endpoint(String test1) {
        return ResponseEntity.ok(new TestResponseV1(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }
}
