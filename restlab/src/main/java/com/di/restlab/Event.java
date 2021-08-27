package com.di.restlab;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * Represents an event.
 * 
 * @author Brian Herron
 */
public class Event {

	/**
	 * The event id.
	 */
	private String id;
	
	/**
	 * The event start date and time.
	 */
	private Date startTime;
	
	/**
	 * The event end date and time.
	 */
	private Date endTime;
	
	/**
	 * The event description.
	 */
	private String description;
	
	/**
	 * The event location.
	 */
	private String location;
	
	/**
	 * @return the start time, in MM/dd/yyyy hh:mm:ss aa format.
	 */
	public String getFormattedStartTime() {
		return new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa").format(this.startTime);
	}
	
	/**
	 * @return the end time, in MM/dd/yyyy hh:mm:ss aa format.
	 */
	public String getFormattedEndTime() {
		return new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa").format(this.endTime);
	}
	
	/**
	 * @return the id
	 */
	public String getId() {
		return this.id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the startTime
	 */
	public Date getStartTime() {
		return this.startTime;
	}

	/**
	 * @param startTime the startTime to set
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * @return the endTime
	 */
	public Date getEndTime() {
		return this.endTime;
	}

	/**
	 * @param endTime the endTime to set
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return new ReflectionToStringBuilder(this).toString();
	}
}
