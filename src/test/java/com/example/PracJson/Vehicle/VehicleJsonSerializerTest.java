package com.example.PracJson.Vehicle;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@JsonTest
@RunWith(SpringRunner.class)
public class VehicleJsonSerializerTest {

    @Autowired
    private ObjectMapper objectMapper;


    @Test
    public void testSerialization() throws JsonProcessingException {
        VehicleDetails vehicleDetails = new VehicleDetails(new Details("Ford","Focus"));
        String json  = objectMapper.writeValueAsString(vehicleDetails);
        assertEquals("{\"details\":{\"make\":\"Ford\",\"focus\":\"Focus\"}}", json);
    }
}