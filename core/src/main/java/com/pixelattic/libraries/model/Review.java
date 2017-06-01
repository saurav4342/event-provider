package com.pixelattic.libraries.model;

import org.bson.types.ObjectId;

public class Review {
private String content;
private ObjectId customerId;
private ObjectId professionalId;
public void setContent(String content){
	this.content=content;
}
public void setUserId(ObjectId customerId){
	this.customerId=customerId;
}
public void setProfessionalId(ObjectId professionalId){
	this.professionalId=professionalId;
}
public String getContent(){
	return content;
}
public ObjectId getUserId(){
	return customerId;
}
public ObjectId getProfessionalId(){
	return professionalId;
}
}
