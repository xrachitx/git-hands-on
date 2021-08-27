package com.di.restlab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Represents the repository of contacts.
 * 
 * @author Brian Herron
 */
public class EventRepository {

	/**
	 * A map of contacts, stored by id.
	 */
	private static final Map<String, Event> EVENTS = new TreeMap<String, Event>();
	
	/**
	 * A static initialization block to pre-load some events.
	 */
	static {
		Event doctorsAppointment = new Event();
		doctorsAppointment.setId("1");
		doctorsAppointment.setDescription("Appointment with Dr. Jones");
		doctorsAppointment.setLocation("Doctor's Office");
		doctorsAppointment.setStartTime(new Date(1467046800000l));
		doctorsAppointment.setEndTime(new Date(1467054000000l));
		EVENTS.put(doctorsAppointment.getId(), doctorsAppointment);
		
		Event projectMeeting = new Event();
		projectMeeting.setId("2");
		projectMeeting.setDescription("Project Meeting");
		projectMeeting.setLocation("Conference Room 2");
		projectMeeting.setStartTime(new Date(1467118800000l));
		projectMeeting.setEndTime(new Date(1467126000000l));
		EVENTS.put(projectMeeting.getId(), projectMeeting);
		
		Event concert = new Event();
		concert.setId("3");
		concert.setDescription("Shakey Graves Concert");
		concert.setLocation("The Ark");
		concert.setStartTime(new Date(1467417600000l));
		concert.setEndTime(new Date(1467424800000l));
		EVENTS.put(concert.getId(), concert);
	}
	
	/**
	 * Finds all events.
	 * 
	 * @return all events
	 */
	public List<Event> findAll() {
		return new ArrayList<Event>(EVENTS.values());
	}
	
	/**
	 * Finds an event by id.
	 * 
	 * @param id the event id
	 * @return the event, or null if no event is found
	 */
	public Event findById(String id) {
		return EVENTS.get(id);
	}
	
	/**
	 * Creates an event.
	 * 
	 * @param event the event to create
	 * @return the created event, complete with an id
	 */
	public Event create(Event event) {
		event.setId(String.valueOf(Integer.parseInt(Collections.max(EVENTS.keySet())) + 1));
		EVENTS.put(event.getId(), event);
		
		return event;
	}
	
	/**
	 * Updates an event.
	 * 
	 * @param event the event to update
	 * @return <code>true</code> if the event was found and updated
	 */
	public boolean update(String id, Event event) {
		event.setId(id);
		if (EVENTS.get(event.getId()) == null) {
			return false;
		}
		
		EVENTS.put(event.getId(), event);
		return true;
	}
	
	/**
	 * Deletes an event.
	 * 
	 * @param id the event id
	 * @return <code>true</code> if the event was found and deleted
	 */
	public boolean delete(String id) {
		return EVENTS.remove(id) != null;
	}
}
