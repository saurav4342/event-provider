package com.pixelattic.libraries.model;

import java.util.List;

import org.bson.types.ObjectId;

public class Quotation {
	private List<Event> eventList;
	private ObjectId professionalId;
	public void setEventList(List<Event> eventList){
		this.eventList=eventList;
	}
	public void setProfessionalId(ObjectId professionalId){
		this.professionalId=professionalId;
	}
	public List<Event> getEventList(){
	return eventList;	
	}
	public ObjectId getProfessionalId(){
		return professionalId;
	}
}
