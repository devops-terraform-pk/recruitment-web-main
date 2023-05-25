package com.recruitment.web.main.recruitmentwebmain.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecruitmentMainController {

    @GetMapping("/{id}")
    ResponseEntity<CreateRequest> getRecruitmentsData(@PathVariable Long id) {

        return ResponseEntity.ok(new CreateRequest());
    }

    @GetMapping("/")
    ResponseEntity<List<CreateRequest>> getAllRecruitmentsData() {

        List<CreateRequest> allRequests = new ArrayList<>();
        return ResponseEntity.ok(allRequests);
    }
}
