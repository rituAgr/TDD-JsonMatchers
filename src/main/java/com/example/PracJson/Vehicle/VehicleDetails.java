package com.example.PracJson.Vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;

@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonComponent
public class VehicleDetails {

//    String make;
//    String focus;
    private Details details;
}
@NoArgsConstructor
@AllArgsConstructor
@Data
@JsonComponent
class Details{
    String make;
    String focus;
}
