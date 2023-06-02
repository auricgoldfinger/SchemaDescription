package com.example.geopoint;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Schema(description = "A GPS route")
@Data
public class RouteDto {

	@Schema(description = "Name of the route", example="My Trip to Iceland")
	private String name;

	@Schema(description = "Point where the route begins")
	private GeoPointDto startPoint;

	@Schema(description = "Intermediate point of the route")
	private GeoPointDto intermediatePoint;

	@Schema(description = "Point where the route ends")
	private GeoPointDto endPoint;
}