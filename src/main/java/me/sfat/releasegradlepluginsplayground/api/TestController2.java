package me.sfat.releasegradlepluginsplayground.api;

import me.sfat.releasegradlepluginsplayground.TestResponseV2;
import me.sfat.releasegradlepluginsplayground.TestResponseV3;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class TestController2 {

    @GetMapping("/api/v2/test/endpoint")
    public ResponseEntity<TestResponseV2> testV2Endpoint(String test1) {
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
