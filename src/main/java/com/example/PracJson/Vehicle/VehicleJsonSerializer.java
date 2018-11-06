package com.example.PracJson.Vehicle;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

@JsonComponent
public class VehicleJsonSerializer extends JsonSerializer<VehicleDetails>{
    @Override
    public void serialize(VehicleDetails vehicleDetails, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException, JsonProcessingException {
        jsonGenerator.writeStartObject();
        jsonGenerator.writeObjectField("details",vehicleDetails.getDetails());
        //jsonGenerator.writeStringField("make",vehicleDetails.getDetails().getMake());
        //jsonGenerator.writeStringField("focus",vehicleDetails.getDetails().getFocus());
        jsonGenerator.writeEndObject();
    }
}
