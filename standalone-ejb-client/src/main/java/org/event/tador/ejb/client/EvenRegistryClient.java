package org.event.tador.ejb.client;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.event.tador.ejb.api.EventRegistry;
import org.event.tador.ejb.api.input.Event;

public class EvenRegistryClient {

	
	public static void main(String[] args) throws NamingException {
		
		System.out.println(new EvenRegistryClient().registerEvent());
		
	}
	
	private EventRegistry eventRegistry;
	
	public String registerEvent() throws NamingException{
		
		Context context = null;
		
		final Properties ejbProperties = new Properties();
		ejbProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming");
		
		context = new InitialContext(ejbProperties);
		
		String lookupName = "ejb:event-tador-ear/event-tador-ejb-impl/EventRegistryEJB!org.event.tador.ejb.api.EventRegistry";
		
		eventRegistry = (EventRegistry)context.lookup(lookupName);
		
		return eventRegistry.registerEvent(new Event());
		
		
	}
	
	
}
