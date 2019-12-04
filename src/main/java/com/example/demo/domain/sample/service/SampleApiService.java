package com.example.demo.domain.sample.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.List;

public interface SampleApiService {
    /**
     * This method gets all people list.
     * @return all people list.
     */
    String getAllPeopleList();

    /**
     * This method is creating json response.
     * @return json response.
     * @throws JsonProcessingException failed encoding to json.
     */
    String createPeopleJsonResponse(List<?> recordList) throws JsonProcessingException;
}
