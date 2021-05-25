package ua.lviv.iot.sport.service.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import ua.lviv.iot.sport.Athletics;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;


@Path("/athletics")
public class SportController {
    private static final HashMap<Integer, Athletics> ATHLETICS = new HashMap<>();
    private static int nextId;

    private int getNextId() {
        return nextId++;

    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Athletics> getAthletics() {
        return new ArrayList<>(ATHLETICS.values());
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response postShoes(final String body) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Athletics newAthletics = mapper.readValue(body, Athletics.class);
        newAthletics.setId(getNextId());
        ATHLETICS.put(newAthletics.getId(), newAthletics);
        return Response.ok(newAthletics).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAthleticsById(@PathParam("id") final String id) {
        Athletics searchedAthletics = ATHLETICS.get(Integer.parseInt(id));
        if (searchedAthletics == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Shoes not found for id = " + id)
                    .build();
        }
        return Response.ok(searchedAthletics).build();
    }

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response updateAthletics(
            @PathParam("id") final String id,
            final Athletics updatedAthletics) {
        Athletics oldAthletics = ATHLETICS.get(Integer.parseInt(id));

        if (oldAthletics == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Shoes not found for id = " + id)
                    .build();
        }

        updatedAthletics.setId(oldAthletics.getId());

        ATHLETICS.replace(updatedAthletics.getId(), updatedAthletics);

        return Response.ok(oldAthletics).build();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response deleteAthletics(@PathParam("id") final String id) {
        Athletics oldAthletics = ATHLETICS.get(Integer.parseInt(id));

        if (oldAthletics == null) {
            return Response.status(Response.Status.NOT_FOUND)
                    .entity("Shoes not found for id = " + id)
                    .build();
        }

        return Response.ok(ATHLETICS.remove(oldAthletics.getId())).build();
    }
}