package com.di.restlab;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * A RESTful service to interact with {@link Event}.
 * 
 * @author Brian Herron
 */
@Path("/events")
public class EventService {

	/**
	 * Handles GET requests for the path /events by returning all events.
	 * 
	 * @return all contacts
	 */
	@GET
	@Produces("application/json")
	public Response findAll() {
		return Response.status(Response.Status.OK).entity(new EventRepository().findAll()).build();
	}
	
	/**
	 * Handles GET requests for the path /events/{eventId} by returning the matching event. If no matching 
	 * event is found, a 404 Not Found response is returned.
	 * 
	 * @param id the event id
	 * @return the matching event, or the appropriate error response
	 */
	@GET
	@Path("/{contactId}")
	@Produces("application/json")
	public Response findById(@PathParam(value = "contactId") String id) {
		Event event = new EventRepository().findById(id);
		if (event == null) {
			return Response.status(Response.Status.NOT_FOUND).entity("No event found for id: " + id).build();
		}
		
		return Response.status(Response.Status.OK).entity(event).build();
	}
	
	/**
	 * Handles POST requests for the path /events by creating a new event.
	 * 
	 * @param event the event to create
	 * @return the newly created event, including the event id
	 */
	@POST
	@Consumes("application/json")
	@Produces("application/json")
	public Response create(Event event) {
		if (event != null) {
			if (event.getStartTime() != null && event.getEndTime() != null) {
				return Response.status(Response.Status.CREATED).entity(new EventRepository().create(event)).build();
			} else {
				return Response.status(Response.Status.BAD_REQUEST).entity("Invalid date/time format.").build();
			}
			
		} else {
			return Response.status(Response.Status.BAD_REQUEST).entity("Invalid event").build();
		}
	}
	
	/**
	 * Handles PUT requests for the path /events/{eventId} by updating the matching event. If no matching event
	 * is found, a 404 Not Found response is returned.
	 * 
	 * @param id the event id
	 * @return the updated event, or the appropriate error response
	 */
	@PUT
	@Path("/{eventId}")
	@Consumes("application/json")
	@Produces("application/json")
	public Response update(@PathParam(value = "eventId") String id, Event event) {
		// this is pointless code added to trigger a 500 error when submitting a non-numeric id
		Integer theId = Integer.parseInt(id);
		boolean success = new EventRepository().update(theId.toString(), event);
		if (success) {
			return Response.status(Response.Status.OK).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
	
	/**
	 * Handles DELETE requests for the path /events/{eventId} by updating the matching event. If no matching 
	 * event is found, a 404 Not Found response is returned.
	 * 
	 * @param id the event id
	 */
	@DELETE
	@Path("/{eventId}")
	@Produces("application/json")
	public Response delete(@PathParam(value = "eventId") String id) {
		boolean success = new EventRepository().delete(id);
		if (success) {
			return Response.status(Response.Status.OK).build();
		} else {
			return Response.status(Response.Status.NOT_FOUND).build();
		}
	}
}
