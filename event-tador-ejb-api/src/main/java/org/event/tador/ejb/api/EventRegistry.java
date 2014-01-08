/**
 * 
 */
package org.event.tador.ejb.api;

import javax.ejb.Remote;

import org.event.tador.ejb.api.input.Event;
import org.event.tador.ejb.api.input.EventType;

/**
 * EJB to register events and new event types
 * 
 * @author Rudy Adams
 *
 */


public interface EventRegistry {
	
	/**
	 * Register an event
	 * 
	 * 
	 * @return Id created for the event
	 */
	public String registerEvent(Event event);
	
	/**
	 * Register new type of event
	 * 
	 * 
	 * @return event-type successfully registered or not. 
	 */
	public boolean registerNewEventType(EventType eventType);
	

}
