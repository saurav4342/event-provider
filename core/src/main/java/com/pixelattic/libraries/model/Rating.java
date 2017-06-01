package com.pixelattic.libraries.model;

import org.bson.types.ObjectId;

public class Rating {
private int star;
private ObjectId customerId;
private ObjectId professionalId;
public void setStar(int star){
	this.star=star;
}
public void setUserId(ObjectId customerId){
	this.customerId=customerId;
}
public void setPhotographerId(ObjectId professionalId){
	this.professionalId=professionalId;
}
public int getStar(){
	return star;
}
public ObjectId getCustomerId(){
	return customerId;
}
public ObjectId getProfessionalId(){
	return professionalId;
}
}
