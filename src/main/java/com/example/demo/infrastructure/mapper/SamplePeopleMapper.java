package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.general.model.SamplePeople;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Mapper
@Component
public class SamplePeopleMapper {

    public List<SamplePeople> selectAll() {
        // TODO : implement for searching records from database.
        return new ArrayList<>();
    }
}
