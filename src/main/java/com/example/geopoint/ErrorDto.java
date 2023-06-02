package com.example.geopoint;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class ErrorDto {

	@Schema(description = "Description of the error")
	private String description;

}