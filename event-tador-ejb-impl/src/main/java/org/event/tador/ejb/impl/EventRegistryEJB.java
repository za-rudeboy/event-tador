/**
 * 
 */
package org.event.tador.ejb.impl;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import org.event.tador.ejb.api.EventRegistry;
import org.event.tador.ejb.api.input.Event;
import org.event.tador.ejb.api.input.EventType;

/**
 * @author Rudy Adams
 *
 */

@Stateless
@Remote(EventRegistry.class)
public class EventRegistryEJB implements EventRegistry {

	public String registerEvent(Event event) {
		// TODO Auto-generated method stub
		return "eventRegistered";
	}

	public boolean registerNewEventType(EventType eventType) {
		// TODO Auto-generated method stub
		return false;
	}

}
