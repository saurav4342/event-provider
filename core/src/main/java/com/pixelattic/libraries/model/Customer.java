package com.pixelattic.libraries.model;

public class Customer {
	private String name;
	private String email;
private String password;
	private String activationCode;
	private boolean isValidUser;
	private String city;
	private char gender;
	private	long dateTimeOfJoining;
	private String exactAddress; 
	private String contact;
	private boolean isNumberVerified;

public void setName(String name){
	this.name=name;
}
public void setEmail(String email){
	this.email=email;
}
public void setPassword(String password){
	this.password=password;
}
public void setActivationCode(String activationCode){
	this.activationCode=activationCode;
}
public void setIsValidUser(boolean isValidUser){
	this.isValidUser=isValidUser;
}
public void setCity(String city){
	this.city=city;
}
public void setgender(char gender){
	this.gender=gender;
}
public void setDateTimeOfJoining(long dateTimeOfJoining){
	this.dateTimeOfJoining=dateTimeOfJoining;
}
public void setExactAddress(String exactAddress){
	this.exactAddress=exactAddress;
}
public void setContact(String contact){
	this.contact=contact;
}
public void setIsNumberVerified(boolean isNumberVerified){
	this.isNumberVerified=isNumberVerified;
}
public String getName(){
	return name;
}
public String getEmail(){
	return email;
}
public String getPassword(){
	return password;
}
public String getActivationCode(){
	return activationCode;
}
public boolean getIsValidUser(){
	return isValidUser;
}
public String getCity(){
	return city;
}
public char getGender(){
	return gender;
}
public long getDateTimeOfJoining(){
	return dateTimeOfJoining;
}

public String getExactAddress(){
	return exactAddress;
}
public String getContact(){
	return contact;
}
public boolean getIsNumberVerified(){
	return isNumberVerified;
}
}