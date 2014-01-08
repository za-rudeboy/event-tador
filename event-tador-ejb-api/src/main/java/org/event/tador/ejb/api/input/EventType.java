package org.event.tador.ejb.api.input;

import java.io.Serializable;

public class EventType implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8334065209026121989L;
	private String eventType;
	private String eventTypeDescription;
	
	
	
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getEventTypeDescription() {
		return eventTypeDescription;
	}
	public void setEventTypeDescription(String eventTypeDescrition) {
		this.eventTypeDescription = eventTypeDescrition;
	}

}
