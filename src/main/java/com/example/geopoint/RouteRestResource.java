package com.example.geopoint;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.net.URI;


@Path("/v2/routes")
public class RouteRestResource {

    @Operation(summary = "Create a route"
//     ,
//             responses = {
//                     @ApiResponse(responseCode = "201",
//                             description = "Success",
//                             content = @Content(
//                                     mediaType = "application/json",
//                                     schema = @Schema(implementation = RouteDto.class)
//                 //             )),
//                 //     @ApiResponse(responseCode = "400",
//                 //             description = "Invalid parameter supplied",
//                 //             content = @Content(
//                 //                     mediaType = "application/json",
//                 //                     schema = @Schema(implementation = ErrorDto.class)
//                 //             )),
//                 //     @ApiResponse(responseCode = "404",
//                 //             description = "Param not found",
//                 //             content = @Content(
//                 //                     mediaType = "application/json",
//                 //                     schema = @Schema(implementation = ErrorDto.class)
//                             ))
//             }
            )
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{routeid}")
    public Response createRoute(@Parameter(schema = @Schema(type = "string")) @PathParam("routeid") final String routeid,
                                @Parameter(required = true) final RouteDto route,
                                @Context final UriInfo uriInfo) {

        return Response.created(URI.create("http://example.com/route/"+routeid))
                .entity(route).build();
    }

}
