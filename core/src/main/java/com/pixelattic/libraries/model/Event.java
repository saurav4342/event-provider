package com.pixelattic.libraries.model;

import java.util.List;

import org.bson.types.ObjectId;

public class Event {
private EventType eventType;
private EventOptions eventOptions;
private List<String> comboEvents;
private long price;
private float discount;
private long validTill;
private ObjectId professionalId;
public void setEventType(EventType eventType){
	this.eventType=eventType;
}
public void setEventOptions(EventOptions eventOptions){
	this.eventOptions=eventOptions;
}
public void setComboEvents(List<String> comboEvents){
	this.comboEvents=comboEvents;
}
public void setPrice(long price){
	this.price=price;
}
public void setDiscount(float discount){
	this.discount=discount;
}
public void setValidTill(long validTill){
	this.validTill=validTill;
}
public void setProfessionalId(ObjectId professionalId){
	this.professionalId=professionalId;
}
public EventType getEventType(){
	return eventType;
}
public EventOptions getEventOptions(){
	return eventOptions;
}
public List<String> getComboEvents(){
	return comboEvents;
}
public long getPrice(){
	return price;
}
public float getDiscount(){
	return discount;
}
public long getValidTill(){
	return validTill;
}
public ObjectId getProfessionalId(){
	return professionalId;
}
}
