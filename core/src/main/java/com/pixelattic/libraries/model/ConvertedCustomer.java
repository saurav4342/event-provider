package com.pixelattic.libraries.model;

import org.bson.types.ObjectId;

public class ConvertedCustomer {
	private ObjectId customerId;
	private ObjectId guestUserId;
	private ObjectId eventId;
	private String location;
	private long date;
	private ObjectId professionalId;
public void setCustomerId(ObjectId customerId){
	this.customerId=customerId;
}
public void setGuestUserId(ObjectId guestUserId){
	this.guestUserId=guestUserId;
}
public void setEventType(ObjectId eventId){
	this.eventId=eventId;
}
public void setLocation(String location){
	this.location=location;
}
public void setDate(long date){
	this.date=date;
}
public void setProfessionalId(ObjectId professionalId){
	this.professionalId=professionalId;
}
public ObjectId getCustomerId(){
	return customerId;
}
public ObjectId getGuestUserId(){
	return guestUserId;
}
public ObjectId getEventId(){
	return eventId;
}
public String getLocation(){
	return location;
}
public long getDate(){
	return date;
}
public ObjectId getProfessionalId(){
	return professionalId;
}
}
