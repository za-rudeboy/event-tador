package org.event.tador.ejb.api.input;

import java.io.Serializable;
import java.util.Date;

public class Event implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -501502403591403535L;
	private String clientKey;
	private String eventType;
	private Date timeStamp;
	private String miscInfo;
	private Priority priority;
	
	
	
	public String getClientKey() {
		return clientKey;
	}
	public void setClientKey(String clientKey) {
		this.clientKey = clientKey;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getMiscInfo() {
		return miscInfo;
	}
	public void setMiscInfo(String miscInfo) {
		this.miscInfo = miscInfo;
	}
	public Priority getPriority() {
		return priority;
	}
	public void setPriority(Priority priority) {
		this.priority = priority;
	}
	

}
