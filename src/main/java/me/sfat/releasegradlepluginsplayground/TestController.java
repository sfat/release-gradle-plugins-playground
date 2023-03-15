package me.sfat.releasegradlepluginsplayground;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController {

    @GetMapping("/api/v1.0.0/test/endpoint")
    public ResponseEntity<TestResponseV1> testV1Endpoint() {
        return ResponseEntity.ok(new TestResponseV1(UUID.randomUUID().toString()));
    }

    @GetMapping("/api/v2/test/endpoint")
    public ResponseEntity<TestResponseV2> testV2Endpoint() {
        // fixing something
        return ResponseEntity.ok(new TestResponseV2(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }

    @GetMapping("/api/v3/test/endpoint")
    public ResponseEntity<TestResponseV3> testV3Endpoint() {
        // fixing something
        return ResponseEntity.ok(new TestResponseV3(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }

    @GetMapping("/api/v4/test/endpoint")
    public ResponseEntity<TestResponseV2> testV4Endpoint() {
        // fixing something
        return ResponseEntity.ok(new TestResponseV2(UUID.randomUUID().toString(), UUID.randomUUID().toString()));
    }
}
