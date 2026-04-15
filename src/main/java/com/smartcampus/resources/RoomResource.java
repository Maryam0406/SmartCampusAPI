package com.smartcampus.resources;

import com.smartcampus.models.Room;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.*;

@Path("/rooms")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RoomResource {

    private static Map<String, Room> rooms = new HashMap<>();

    // GET all rooms
    @GET
    public Collection<Room> getAllRooms() {
        return rooms.values();
    }

    // POST create room
    @POST
    public String createRoom(Room room) {
        rooms.put(room.getId(), room);
        return "Room created successfully";
    }

    // GET room by ID
    @GET
    @Path("/{id}")
    public Room getRoom(@PathParam("id") String id) {
        return rooms.get(id);
    }
}