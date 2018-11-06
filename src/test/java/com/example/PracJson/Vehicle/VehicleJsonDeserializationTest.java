package com.example.PracJson.Vehicle;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@JsonTest
public class VehicleJsonDeserializationTest {
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void deserialize() throws Exception {
        String json = "{\"details\":{\"make\":\"Ford\",\"focus\":\"Focus\"}}";
        VehicleDetails vehicleDetails = objectMapper.readValue(json, VehicleDetails.class);
        assertEquals(new Details("Ford","Focus"), vehicleDetails.getDetails());
    }

}