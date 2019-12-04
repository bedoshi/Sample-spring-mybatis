package com.example.demo.infrastructure.sample.service;

import com.example.demo.domain.general.model.SamplePeople;
import com.example.demo.domain.sample.service.SampleApiService;
import com.example.demo.infrastructure.mapper.SamplePeopleMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleApiServiceImpl implements SampleApiService {

    private SamplePeopleMapper samplePeopleMapper;

    @Autowired
    public SampleApiServiceImpl(SamplePeopleMapper samplePeopleMapper) {
        this.samplePeopleMapper = samplePeopleMapper;
    }

    @Override
    public String getAllPeopleList() {
        val records = searchTargetData();
        String json = null;

        try {
            json = createPeopleJsonResponse(records);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public String createPeopleJsonResponse(List<?> recordList) throws JsonProcessingException {
        val records = searchTargetData();

        val objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(records);
    }

    private List<SamplePeople> searchTargetData() {
        return samplePeopleMapper.selectAll();
    }
}
