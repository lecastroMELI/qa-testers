package dh.meli.qatesters.controller;

import dh.meli.qatesters.model.TestCase;
import dh.meli.qatesters.service.TestCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tests")
public class TestCaseController {

    @Autowired
    private TestCaseService service;

    @PostMapping
    public ResponseEntity<TestCase> insertTest(@RequestBody TestCase newTestCase) {
        return ResponseEntity.ok(service.insertTest(newTestCase));
    }
}
