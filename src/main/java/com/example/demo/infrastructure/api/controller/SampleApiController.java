package com.example.demo.infrastructure.api.controller;

import com.example.demo.domain.sample.service.SampleApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is easy sample rest controller.
 */
@RestController
@RequestMapping("/api")
public class SampleApiController {

    private SampleApiService sampleApiService;

    @Autowired
    public SampleApiController(SampleApiService sampleApiService) {
        this.sampleApiService = sampleApiService;
    }
    @GetMapping("/sample_list")
    public String sampleGetAllPeople() {
        return sampleApiService.getAllPeopleList();
    }

    @PostMapping("/receive_post")
    public String sampleReceivePost() {
        return "";
    }
}
