package com.example.geopoint;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema()
public class GeoPointDto {
    @Schema(description = "Longitude of geo point ( -180, 180 >")
    private double lon;

    @Schema(description = "Latitude of geo point < -90, 90 >")
    private double lat;
}
