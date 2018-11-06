package com.example.PracJson.Vehicle;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;

public class VehicleJsonDeserialization extends JsonDeserializer<VehicleDetails>{

    @Override
    public VehicleDetails deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
        TreeNode treeNode= jsonParser.getCodec().readTree(jsonParser);
        VehicleDetails vehicleDetails = (VehicleDetails)treeNode.get("details");
        return vehicleDetails;

    }
}
